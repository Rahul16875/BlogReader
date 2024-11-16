package com.example.blogreader

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class BlogViewModel : ViewModel() {

    private val _blogPosts = MutableStateFlow<List<BlogPost>>(emptyList())
    val blogPosts: StateFlow<List<BlogPost>> = _blogPosts

    init {
        fetchBlogPosts()
    }

    private fun fetchBlogPosts() {
        viewModelScope.launch {
            try {
                val posts = RetrofitInstance.api.getBlogPosts(perPage = 10, page = 1)
                _blogPosts.value = posts
            } catch (e: Exception) {
                e.printStackTrace() // Handle error
            }
        }
    }
}
