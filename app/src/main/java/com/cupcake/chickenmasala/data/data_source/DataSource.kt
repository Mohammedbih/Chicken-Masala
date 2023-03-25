package com.cupcake.chickenmasala.data.data_source

import com.cupcake.chickenmasala.data.model.HealthyAdvices
import com.cupcake.chickenmasala.data.model.Recipe

interface DataSource {
    fun getRecipes(): List<Recipe>
    fun getHealthAdvices(): List<HealthyAdvices>
}