package com.an.dg.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;



public class HelloDtoTest {

    @Test
    public void 롬복_테스트(){

//        given
        String name = "테스트";
        int amount = 9999;

//        when
        HelloDto dto = new HelloDto(name, amount);

//        then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
