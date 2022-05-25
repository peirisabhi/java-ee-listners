/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author abhi
 */

//@WebListener
public class ContextAttributeListner implements ServletContextAttributeListener{

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("Attribute Added" + event.getName() +  " value:" + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("Attribute Removed" + event.getName() +  " value:" + event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        
        System.out.println("Attribute Replaced" + event.getName() +  " value:" + event.getValue());
        
    }

}
