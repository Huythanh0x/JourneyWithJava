package com.huythanh0x.firstcrudspringapp.repository;

import com.huythanh0x.firstcrudspringapp.entity.CouponCourseData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponRepository extends JpaRepository<CouponCourseData, Integer> {
    CouponCourseData findByCategory(String category);
}
