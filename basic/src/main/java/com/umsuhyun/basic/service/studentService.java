package com.umsuhyun.basic.service;

import org.springframework.http.ResponseEntity;

import com.umsuhyun.basic.dto.request.student.PatchStudentRequestDto;
import com.umsuhyun.basic.dto.request.student.PostStudentRequestDto;

public interface studentService {
        ResponseEntity<String> postStudent(PostStudentRequestDto dto);
        ResponseEntity<String> patchStudent (PatchStudentRequestDto dto);
}
