package com.javatpoint.application1;

import java.util.ArrayList;'
import java.util.List;
import org.apache.commons.lang3.StringUtils;

class Application{

public int cw(String w){
String[] sw=StringUtils.split(w,' ');
return (sw==null)? 0:sw.length;
}
public static void main(String[] args){
System.out.print("hello");
Application a=new Application();
int c=a.cw("i have four words");
System.out.print(c);
}}