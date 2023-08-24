package com.youlalala.marvel.domain.usecase

import android.util.Log
import com.youlalala.marvel.domain.ErrorMessage
import com.youlalala.marvel.domain.MarvelErrorException
import com.youlalala.marvel.domain.repository.ComicsRepository
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class ComicsUseCaseImpl @Inject constructor(
    private val comicsRepository: ComicsRepository
) : ComicsUseCase {
    override fun getComics() = flow {
        comicsRepository.getComics().collect {
            emit(it)
        }
    }
}