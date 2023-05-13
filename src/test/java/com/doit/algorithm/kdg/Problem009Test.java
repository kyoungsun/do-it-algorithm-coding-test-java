package com.doit.algorithm.kdg;

import org.junit.jupiter.api.Test;

public class Problem009Test {

    @Test
    void test() {
        int n = 9;
        int len = 8;
        String s = "CCTGGATTG";
        String includes = "2 0 1 1";

        int result = Problem009.solution(n, len, s, includes);

        System.out.println("result : " + result);
    }

    @Test
    void test_2() {
        int n = 4;
        int len = 2;
        String s = "GATA";
        String includes = "1 0 0 1";

        int result = Problem009.solution(n, len, s, includes);

        System.out.println("result : " + result);
    }
}
