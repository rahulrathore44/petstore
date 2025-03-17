package com.test.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0003\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/test/model/Pet;", "", "id", "", "category", "Lcom/test/model/Category;", "name", "", "photoUrls", "", "tags", "Lcom/test/model/Tag;", "status", "(ILcom/test/model/Category;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCategory", "()Lcom/test/model/Category;", "getId", "()I", "getName", "()Ljava/lang/String;", "getPhotoUrls", "()Ljava/util/List;", "getStatus", "getTags", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "petstore"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonInclude(value = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public final class Pet {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final com.test.model.Category category = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> photoUrls = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.test.model.Tag> tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String status = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Pet copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "category")
    com.test.model.Category category, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "photoUrls")
    java.util.List<java.lang.String> photoUrls, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "tags")
    java.util.List<com.test.model.Tag> tags, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "status")
    java.lang.String status) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Pet(@com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "category")
    com.test.model.Category category, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "photoUrls")
    java.util.List<java.lang.String> photoUrls, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "tags")
    java.util.List<com.test.model.Tag> tags, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "status")
    java.lang.String status) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Category component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Category getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getPhotoUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Tag> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Tag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
}