package com.example.ShopAccDuyAnh.Repository;

import com.example.ShopAccDuyAnh.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
