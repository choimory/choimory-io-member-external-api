package io.choimory.member.external.api.common.domain

import java.time.LocalDateTime

data class CommonDateDocument(
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime,
    val deletedAt: LocalDateTime,
)
