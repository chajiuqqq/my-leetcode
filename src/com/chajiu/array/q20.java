package com.chajiu.array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 要注意的情况：
 * - pop出来要和当前字符进行匹配，如（和）匹配
 * - 一开始输入右括号时要判断一下，无法出栈了
 */
public class q20 {
    public boolean isValid(String s) {
        LinkedList<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                q.add(c);
            }else{
                if(q.size()==0)
                    return false;
                Character last = q.removeLast();
                if(last=='(' && c!=')' || last=='[' && c!=']' || last=='{' && c!='}'){
                    return false;
                }
            }

        }
        return q.size()==0;

    }
}
