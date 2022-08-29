package com.example.ch14_second_hand.chatdetail

data class ChatItem(val senderId: String, val message: String) {
    constructor(): this("", "")
}