package com.huythanh0x.firstcrudspringapp.controller;

import com.huythanh0x.firstcrudspringapp.entity.CouponCourseData;
import com.huythanh0x.firstcrudspringapp.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CouponController {
    long INTERVAL = 10 * 60 * 1000;
    @Autowired
    private CouponService service;
    boolean serverStarted = false;
    Long lastFetch = System.currentTimeMillis();

    int counter = 0;

    void fetchDataInTheBackground() {
        try {
            Thread backgroundThread = new Thread(() -> {
                while (true) {
                    System.out.println("Running in the background");
                    try {
                        service.saveCoupons(FetchCouponData.fetchAllCoupons());
                        System.out.println("COMPLETE FETCHING DATA");
                    } catch (Exception e) {
                        System.out.println("FAILED TO UPDATE THE DATA" + e);
                    }
                    long delayTime = INTERVAL - (System.currentTimeMillis() - lastFetch);
                    lastFetch = System.currentTimeMillis();
                    try {
                        System.out.println("Wait for " + delayTime + " to fetch the new data");
                        Thread.sleep(delayTime);
                    } catch (InterruptedException e) {
                        System.out.println("Encountered error while sleep " + e);
                    }
                }
            });
            backgroundThread.start();
        } catch (Exception e) {
            System.out.println("Encounter exception");
        }

    }

    @GetMapping("/")
    public String homePage() {
        if (!serverStarted) {
            fetchDataInTheBackground();
            serverStarted = true;
        }
        counter++;
        return "This is the home page " + counter + " times";
    }

    @PostMapping("/addCoupon")
    public CouponCourseData addCoupon(@RequestBody CouponCourseData coupon) {
        return service.saveCoupon(coupon);
    }

    @PostMapping("/addCoupons")
    public List<CouponCourseData> addCoupons(@RequestBody List<CouponCourseData> coupons) {
        return service.saveCoupons(coupons);
    }

    @GetMapping("/fetch/all")
    public List<CouponCourseData> fetchAllCoupons() {
        return service.getCoupons();
    }

    @GetMapping("fetch/{numberOfCoupon}")
    public List<CouponCourseData> fetchNCoupons(@PathVariable int numberOfCoupon) {
        return service.getCoupons().subList(0, numberOfCoupon);
    }

    @GetMapping("/coupon/{id}")
    public CouponCourseData getCouponById(@PathVariable int id) {
        return service.getCouponById(id);
    }
}
