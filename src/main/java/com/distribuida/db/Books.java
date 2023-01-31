package com.distribuida.db;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books implements Serializable {
    private Integer id;
    @Size(max = 16)
    private String isbn;
    @Size(max = 128)
    private String title;
    @Size(max = 6)
    private Integer author_id;
    @Size(max = 6)
    private BigDecimal price;

}
