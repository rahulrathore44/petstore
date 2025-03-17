package com.test.controller

import com.test.model.Pet
import com.test.service.PetService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import jakarta.inject.Inject

@Controller("/pets")
class PetController @Inject constructor(private val petService: PetService) {

    @Get("/findPetById/{id}")
    fun findPetById(@PathVariable id: Int): HttpResponse<Pet> {
        val pet = petService.findPetById(id)
        return if (pet != null) {
            HttpResponse.ok(pet)
        } else {
            HttpResponse.notFound()
        }
    }

    @Get("/findPetsByIdNameAndStatus")
    fun findPetsByIdNameAndStatus(
        @QueryValue id: Int,
        @QueryValue name: String,
        @QueryValue status: String
    ): HttpResponse<List<Pet>> {
        val pet = petService.findPetsByIdNameAndStatus(id, name, status)
        return HttpResponse.ok(pet)
    }

    @Get("/findPetByIdNameAndStatus")
    fun findPetByIdNameAndStatus(
        @QueryValue id: Int,
        @QueryValue name: String,
        @QueryValue status: String
    ): HttpResponse<Pet> {
        val pet = petService.findPetByIdNameAndStatus(id, name, status)
        return HttpResponse.ok(pet)
    }

    @Get("/findPetsByCategoryName/{categoryName}")
    fun findPetsByCategoryName(
        @PathVariable categoryName: String,
    ): HttpResponse<List<Pet>> {
        val pet = petService.findPetsByCategoryName(categoryName)
        return HttpResponse.ok(pet)
    }

    @Get("/findPetByCategoryName/{categoryName}")
    fun findPetByCategoryName(
        @PathVariable categoryName: String,
    ): HttpResponse<Pet> {
        val pet = petService.findPetByCategoryName(categoryName)
        return HttpResponse.ok(pet)
    }

    @Get("/findPetsByCategoryIdAndName")
    fun findPetsByCategoryIdAndName(
        @QueryValue id: Int,
        @QueryValue name: String
    ): HttpResponse<List<Pet>> {
        val pet = petService.findPetsByCategoryIdAndName(id, name)
        return HttpResponse.ok(pet)
    }

    @Get("/findPetByCategoryIdAndName")
    fun findPetByCategoryIdAndName(
        @QueryValue id: Int,
        @QueryValue name: String
    ): HttpResponse<Pet> {
        val pet = petService.findPetByCategoryIdAndName(id, name)
        return HttpResponse.ok(pet)
    }

    @Post("/addPet")
    fun addPet(@Body pet: Pet): HttpResponse<Pet> {
        val createdPet = petService.save(pet)
        return HttpResponse.created(createdPet)
    }

    @Post("/addPets")
    fun addPets(@Body pet: List<Pet>): HttpResponse<List<Pet>> {
        val createdPet = petService.savePets(pet)
        return HttpResponse.created(createdPet)
    }

    @Put("/updatePetById/{id}")
    fun updatePet(@PathVariable id: Int, @Body pet: Pet): HttpResponse<Pet> {
        val updatedPet = petService.update(id, pet)
        return if (updatedPet != null) {
            HttpResponse.ok(updatedPet)
        } else {
            HttpResponse.notFound()
        }
    }

    @Delete("/deletePetById/{id}")
    fun deletePet(@PathVariable id: Int): HttpResponse<Void> {
        return if (petService.delete(id)) {
            HttpResponse.noContent()
        } else {
            HttpResponse.notFound()
        }
    }

    @Get("/getAllPets")
    fun listPets(): HttpResponse<List<Pet>> {
        val pets = petService.findAll()
        return HttpResponse.ok(pets)
    }

    @Delete("/deleteAllPets")
    fun deleteAllPets(): HttpResponse<Void> {
        petService.deleteAll()
        return HttpResponse.noContent()
    }
}