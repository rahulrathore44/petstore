package com.test.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0014\u001a\u00020\u0012J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/test/service/PetService;", "", "()V", "currentId", "", "pets", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/test/model/Pet;", "delete", "", "id", "deleteAll", "", "findAll", "", "findPetByCategoryIdAndName", "categoryId", "name", "", "findPetByCategoryName", "categoryName", "findPetById", "findPetByIdNameAndStatus", "status", "findPetsByCategoryIdAndName", "findPetsByCategoryName", "findPetsByIdNameAndStatus", "save", "pet", "update", "petstore"})
@jakarta.inject.Singleton
public final class PetService {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.test.model.Pet> pets = null;
    private int currentId = 1;
    
    public PetService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.test.model.Pet findPetById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Pet> findPetsByIdNameAndStatus(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Pet findPetByIdNameAndStatus(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Pet> findPetsByCategoryName(@org.jetbrains.annotations.NotNull
    java.lang.String categoryName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Pet findPetByCategoryName(@org.jetbrains.annotations.NotNull
    java.lang.String categoryName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Pet> findPetsByCategoryIdAndName(int categoryId, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Pet findPetByCategoryIdAndName(int categoryId, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.model.Pet save(@org.jetbrains.annotations.NotNull
    com.test.model.Pet pet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.test.model.Pet update(int id, @org.jetbrains.annotations.NotNull
    com.test.model.Pet pet) {
        return null;
    }
    
    public final boolean delete(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.test.model.Pet> findAll() {
        return null;
    }
    
    public final void deleteAll() {
    }
}