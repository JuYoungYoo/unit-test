package com.juyoung.tdd.demo.junit.pojo;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * :: Test Double ::
 * 테스트에만 사용되는 설정 (가짜 객체 생성)
 * 종류 : Dummy, Fake, Spy, Mock
 * - 의존성을 줄이기 위해 사용
 */

// [2] Mocking
public class RandomCalculatorTest {
    // Mock 사용 전
    @Test
    public void plus() throws Exception {
        // given
        RandomCalculator random = new RandomCalculator(new Random(){
            @Override
            public int nextInt(){
                return 3;
            }
        }, new Calcurator());
        // when
        int result = random.plus(2, 5);
        // then
        assertThat(result, is(10));
    }
    // Mock 사용
    @Test
    public void mock_plus() throws Exception {
        /*
        Stream.of("How are you?","NaNa","Hello","WelCome to Youtub","Hi","Hello","NaNa")
        .filter(text->text.startsWith("H"))
        .map(text -> text.substring(2))
        .distinct()
        .sorted()
        .collect(Collectors.toList());
        */

        //given
        Random random = mock(Random.class);
        when(random.nextInt()).thenReturn(3);
        RandomCalculator randomCalculator = new RandomCalculator(random, new Calcurator());
        //when
        int result = randomCalculator.plus(2, 5);
        //then
        assertThat(result, is(10));
        verify(random,times(1)).nextInt();




    }

    /**
     * SUT : TEST 대상 컴포넌트
     * DOC : 의존 컴포넌트
     *
     *  Mockito 메소드 종류
     *  - Spy, stub
     *  mock() : 모의 객체 생성
     *  when() : 메소드 반환 값을 지정해준다.(Stub)
     *  verify() : SUT 안 메소드가 호출되었는지 확인
     *  times(1) : 지정한 횟수만큼 객체 메소드가 호출되었는지 확인   // never(), atLeastOnce(), atLeast(), atMost()
     *  clear() : 스텁 초기화
     *  timeout() : 지정시간 안에 호출되었는지 확인
      */
}