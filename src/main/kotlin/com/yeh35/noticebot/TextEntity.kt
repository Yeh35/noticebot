package com.yeh35.noticebot

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class TextEntity(text: String) {

    @Id @GeneratedValue
    var id: Long = 0
        private set

    var text: String = text
        private set

}