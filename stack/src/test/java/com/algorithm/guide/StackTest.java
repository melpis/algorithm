package com.algorithm.guide;

import org.junit.Test;




import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StackTest {
    Stack stack = new Stack(5);
    JDKStack<Integer> jdkStack = new JDKStack<>();
    @Test
    public void testPushAndPop() {
        stack.push(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        assertThat(stack.pop(),is(4));
        assertThat(stack.pop(),is(3));
        assertThat(stack.pop(),is(2));
        assertThat(stack.pop(),is(1));
        assertThat(stack.pop(),is(10));
    }
    @Test
    public void testJavaStackPushAndPop() {
        jdkStack.push(10);
        jdkStack.push(1);
        jdkStack.push(2);
        jdkStack.push(3);
        jdkStack.push(4);

        assertThat(jdkStack.pop(),is(4));
        assertThat(jdkStack.pop(),is(3));
        assertThat(jdkStack.pop(),is(2));
        assertThat(jdkStack.pop(),is(1));
        assertThat(jdkStack.pop(),is(10));
    }
}