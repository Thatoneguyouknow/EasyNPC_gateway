package com.npc.Resources.models;

import java.util.Collections;
import java.util.List;

public abstract class ResourceResponse<T> {

    private List<T> data;

    protected ResourceResponse(List<T> data) {
        this.data = data;
    }

    protected ResourceResponse() {
        this.data = Collections.emptyList();
    }

    public Integer getTotal() {
        return data.size();
    }

    public List<T> getData() {
        return data;
    }
}
