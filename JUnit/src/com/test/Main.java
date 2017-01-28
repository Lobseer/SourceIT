package com.test;

import org.apache.log4j.Logger;

/**
 * Class description
 *
 * @author lobseer
 * @version 16.01.2017
 */

public class Main {
    public static final Logger LOG = Logger.getLogger(Main.class);

    String name;

    private Other other;

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public static void main(String[] args) {
        LOG.debug("debug");
        LOG.info("debug");
        LOG.trace("debug");
        LOG.warn("debug");
        LOG.error("debug");
        LOG.fatal("debug");
    }

    public int diff(int i1, int i2) {
        System.out.println(other.do2());
        int result = i1 - i2;
        return result;
    }
}
