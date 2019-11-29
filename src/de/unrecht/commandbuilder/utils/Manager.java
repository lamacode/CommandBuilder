package de.unrecht.commandbuilder.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author unrecht
 * @since 27.11.2019 11:09
 * Copyright © 2019 | unrecht | All rights reserved.
 */

public class Manager<E> {

    protected List<E> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public void addToList(E... objs) {
        this.list.addAll(Arrays.asList(objs));
    }

    public void removeFromList(E... objs) {
        this.list.removeAll(Arrays.asList(objs));
    }

    public void clear() {
        this.list.clear();
    }

    public List<E> getList() {
        return this.list;
    }
}
