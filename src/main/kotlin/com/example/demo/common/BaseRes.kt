package com.example.demo.common

import org.springframework.http.HttpStatus

data class BaseRes(
    val status: HttpStatus,
    val message: String?
)