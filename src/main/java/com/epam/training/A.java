package com.epam.training;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Data
@Log4j2
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class A {

    private int x;
    private long y;
    private String s;

    @Singular
    private List<String> strings;

    public static void main(String... args) {
        A a = new A()
                .setS("khsdfag")
                .setX(4)
                .setY(89);

        int x;
        int y;

        x = 5;

        A jhgsdf = A.builder()
                .s("jhgsdf")
                .x(1)
                .y(5)
                .string("jhgsdfsd")
                .string("jhgsdfsd")
                .string("jhgsdfsd")
                .string("jhgsdfsd")
                .string("jhgsdfsd")
                .build();

        log.warn("hjgsdgjhsdg");
    }
}
