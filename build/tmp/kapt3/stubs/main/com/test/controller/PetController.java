package com.test.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0011H\u0007J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u0011H\u0007J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u0006H\u0007J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/test/controller/PetController;", "", "petService", "Lcom/test/service/PetService;", "(Lcom/test/service/PetService;)V", "addPet", "Lio/micronaut/http/HttpResponse;", "Lcom/test/model/Pet;", "pet", "deleteAllPets", "Ljava/lang/Void;", "deletePet", "id", "", "findPetByCategoryIdAndName", "", "name", "", "findPetByCategoryName", "categoryName", "getPetById", "getPetsByIdNameAndStatus", "status", "listPets", "updatePet", "petstore"})
@io.micronaut.http.annotation.Controller(value = "/pets")
public final class PetController {
    private final com.test.service.PetService petService = null;
    
    @jakarta.inject.Inject
    public PetController(@org.jetbrains.annotations.NotNull
    com.test.service.PetService petService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/findById/{id}")
    public final io.micronaut.http.HttpResponse<com.test.model.Pet> getPetById(@io.micronaut.http.annotation.PathVariable
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/findPetsByIdNameAndStatus")
    public final io.micronaut.http.HttpResponse<java.util.List<com.test.model.Pet>> getPetsByIdNameAndStatus(@io.micronaut.http.annotation.QueryValue
    int id, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.QueryValue
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.QueryValue
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/findPetByCategoryName/{categoryName}")
    public final io.micronaut.http.HttpResponse<java.util.List<com.test.model.Pet>> findPetByCategoryName(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String categoryName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/findPetByCategoryIdAndName")
    public final io.micronaut.http.HttpResponse<java.util.List<com.test.model.Pet>> findPetByCategoryIdAndName(@io.micronaut.http.annotation.QueryValue
    int id, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.QueryValue
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "/addPet")
    public final io.micronaut.http.HttpResponse<com.test.model.Pet> addPet(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    com.test.model.Pet pet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Put(value = "/updatePetById/{id}")
    public final io.micronaut.http.HttpResponse<com.test.model.Pet> updatePet(@io.micronaut.http.annotation.PathVariable
    int id, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    com.test.model.Pet pet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Delete(value = "/deletePetById/{id}")
    public final io.micronaut.http.HttpResponse<java.lang.Void> deletePet(@io.micronaut.http.annotation.PathVariable
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/getAllPets")
    public final io.micronaut.http.HttpResponse<java.util.List<com.test.model.Pet>> listPets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Delete(value = "/deleteAllPets")
    public final io.micronaut.http.HttpResponse<java.lang.Void> deleteAllPets() {
        return null;
    }
}