package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
        private val _tasks = MutableLiveData<List<Task>>()
    val tasks: LiveData<List<Task>> get() = _tasks

    private val _givenTask = MutableLiveData<Task>()
    val givenTask: LiveData<Task?> get() = _givenTask

    init {
        _tasks.value = listOf(
            Task(
                id = 1,
                title = "task1",
                description = "task1 description"
            ),
            Task(
                id = 2,
                title = "task2",
                description = "task2 description"
            )
        )
        _givenTask.value = null
    }

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val found = _tasks.value?.firstOrNull { it.id == id }
        _givenTask.value = found
        return found
    }
}
