/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author SBirmani
 */
public class AdvFilterUtil {
    //Use at the time of decode filter
    public static List<String> getOperatotList(){
        List<String> operatorList = new ArrayList<String>();
        operatorList.add(" = ");
        operatorList.add(" != ");
        operatorList.add(" < ");
        operatorList.add(" > ");
        operatorList.add(" NOT IN ");
        operatorList.add(" IN ");
        operatorList.add(" CurrentDate ");
        operatorList.add(" LessThanCurrentDate ");
        operatorList.add(" GreaterThanCurrentDate ");
        operatorList.add(" CurrentDateAdd ");
        operatorList.add(" CurrentDateMinus ");
        operatorList.add(" StartsWith ");
        operatorList.add(" EndsWith ");
        operatorList.add(" NotStartsWith ");
        operatorList.add(" NotEndsWith ");
        operatorList.add(" Contains ");
        operatorList.add(" NotContains ");
        return operatorList;
    }
    
    //Create invoice by invocie template
    public static Map<String,String> getOperatorMap(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("=", "EQUAL TO");
        map.put("!=", "NOT EQUAL TO");
        map.put("<", "LESS THAN");
        map.put(">", "GREATER THAN");
        map.put(">=", "FROM");
        map.put("<=", "TO");
        map.put("NOT IN", "NOT IN");
        map.put("IN", "IN");
        map.put("CurrentDate", "is(Current Date)");
        map.put("CurrentDateAdd", "is(Current Date Add)");
        map.put("CurrentDateMinus", "is(Current Date Minus)");
        map.put("StartsWith", "is(Starts With)");
        map.put("EndsWith", "is(Ends With)");
        map.put("NotStartsWith", "is(Not Starts With)");
        map.put("NotEndsWith", "is(Not Ends With)");
        map.put("Contains", "is(Contains)");
        map.put("NotContains", "is(Not Contains)");
        return map;
    }
    
    //Advance filter operator.
    public static List<FilterOperator> getFilterOperatorList(){
        List<FilterOperator> operatorList = new ArrayList<FilterOperator>();
        operatorList.add(new FilterOperator("=", "is(=)"));
        operatorList.add(new FilterOperator("!=", "is(!=)"));
        operatorList.add(new FilterOperator("<", "is(<)"));
        operatorList.add(new FilterOperator(">", "is(>)"));
        operatorList.add(new FilterOperator("NOT IN", "is(NOT IN)"));
        operatorList.add(new FilterOperator("IN", "is(IN)"));
        operatorList.add(new FilterOperator("CurrentDate", "is(Current Date)"));
        operatorList.add(new FilterOperator("LessThanCurrentDate", "is(Less Than Current Date)"));
        operatorList.add(new FilterOperator("GreaterThanCurrentDate", "is(Greater Than Current Date)"));
        operatorList.add(new FilterOperator("CurrentDateAdd", "is(Current Date Add)"));
        operatorList.add(new FilterOperator("CurrentDateMinus", "is(Current Date Minus)"));
        operatorList.add(new FilterOperator("StartsWith", "is(Starts With)"));
        operatorList.add(new FilterOperator("EndsWith", "is(Ends With)"));
        operatorList.add(new FilterOperator("NotStartsWith", "is(Not Starts With)"));
        operatorList.add(new FilterOperator("NotEndsWith", "is(Not Ends With)"));
        operatorList.add(new FilterOperator("Contains", "is(Contains)"));
        operatorList.add(new FilterOperator("NotContains", "is(Not Contains)"));
        return operatorList;
    }
}
