package com.utsman.data.di

import com.utsman.abstraction.di.Module
import com.utsman.data.repository.AppsRepository
import com.utsman.data.repository.CategoriesRepository
import com.utsman.data.repository.PagingRepository
import com.utsman.data.route.Services

lateinit var services: Module<Services>
lateinit var appsRepository: Module<AppsRepository>
lateinit var categoriesRepository: Module<CategoriesRepository>
lateinit var pagingRepository: Module<PagingRepository>