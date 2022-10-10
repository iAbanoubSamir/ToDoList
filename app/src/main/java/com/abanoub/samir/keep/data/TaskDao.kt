package com.abanoub.samir.keep.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: Task)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(task: Task)

    @Delete()
    suspend fun delete(task: Task)

    @Query("SELECT * FROM tasks_table")
    fun getTasks(): Flow<List<Task>>

}