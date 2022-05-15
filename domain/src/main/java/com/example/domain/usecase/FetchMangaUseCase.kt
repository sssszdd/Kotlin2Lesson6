package com.example.domain.usecase

import com.example.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke(id:String) = mangaRepository.fetchManga(id)
}