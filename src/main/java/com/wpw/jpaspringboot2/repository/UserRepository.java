package com.wpw.jpaspringboot2.repository;

import com.wpw.jpaspringboot2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select u.username,c.company_id from user u,company c where u.company_id=c.company_id", nativeQuery = true)
    List<Map<String, Object> >getUserCompanyList();
    @Query(value = "select u.username,c.company_id from user u,company c where u.company_id=c.company_id and c.company_id=?1",nativeQuery = true)
    List<Map<String,Object>> getUserCompanyListByCompanyId(Long companyId);
}
