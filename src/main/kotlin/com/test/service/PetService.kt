package com.test.service

import com.test.model.Pet
import jakarta.inject.Singleton
import java.util.concurrent.ConcurrentHashMap

@Singleton
class PetService {

    private val pets = ConcurrentHashMap<Int, Pet>()
    private var currentId = 1

    fun findPetById(id: Int): Pet? {
        return pets.filter { it.key == id }.values.firstOrNull()
    }

    fun findPetsByIdNameAndStatus(id: Int, name: String, status: String): List<Pet> {
        return pets.values.filter { pet ->
            (pet.id == id) &&
                    (pet.name == name) &&
                    (pet.status == status)
        }
    }

    fun findPetByIdNameAndStatus(id: Int, name: String, status: String): Pet {
        return pets.values.first { pet ->
            (pet.id == id) &&
                    (pet.name == name) &&
                    (pet.status == status)
        }
    }

    fun findPetsByCategoryName(categoryName: String): List<Pet> {
        return pets.values.filter { pet ->
            pet.category.name == categoryName
        }
    }

    fun findPetByCategoryName(categoryName: String): Pet {
        return pets.values.first { pet ->
            pet.category.name == categoryName
        }
    }

    fun findPetsByCategoryIdAndName(categoryId: Int, name: String): List<Pet> {
        return pets.values.filter { pet ->
            (pet.category.id == categoryId) &&
                    (pet.name == name)
        }
    }

    fun findPetByCategoryIdAndName(categoryId: Int, name: String): Pet {
        return pets.values.first { pet ->
            (pet.category.id == categoryId) &&
                    (pet.name == name)
        }
    }

    fun save(pet: Pet): Pet {
        pets[pet.id] = pet
        return pet
    }

    fun savePets(pets: List<Pet>): List<Pet> {
        return pets.map { pet ->
            save(pet)
        }
    }

    fun update(id: Int, pet: Pet): Pet? {
        return if (pets.containsKey(id)) {
            val updatedPet = pet.copy(id = id)
            pets[id] = updatedPet
            updatedPet
        } else {
            null
        }
    }

    fun delete(id: Int): Boolean {
        return pets.remove(id) != null
    }

    fun findAll(): List<Pet> {
        return pets.values.toList()
    }

    fun deleteAll() {
        pets.clear()
    }
}