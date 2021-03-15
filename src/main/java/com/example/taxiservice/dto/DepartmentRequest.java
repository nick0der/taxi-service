package com.example.taxiservice.dto;

        import com.example.taxiservice.entity.Chief;
        import lombok.Data;

@Data
public class DepartmentRequest {

    private String address;
    private Chief chief;
}
