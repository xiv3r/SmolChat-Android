/*
 * Copyright (C) 2024 Shubham Panchal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shubham0204.smollmandroid.ui.screens.manage_tasks

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import io.shubham0204.smollmandroid.ui.theme.AppFontFamily

@Composable
fun TaskOptionsPopup(
    onDismiss: () -> Unit,
    onEditTaskClick: () -> Unit,
    onDeleteTaskClick: () -> Unit,
) {
    DropdownMenu(
        expanded = true,
        onDismissRequest = { onDismiss() },
    ) {
        DropdownMenuItem(
            leadingIcon = { Icon(Icons.Default.Edit, contentDescription = "Edit Task") },
            text = { Text("Edit Task", fontFamily = AppFontFamily) },
            onClick = {
                onEditTaskClick()
//                viewModel.showEditTaskDialogState.value = true
//                expanded = false
            },
        )
        DropdownMenuItem(
            leadingIcon = { Icon(Icons.Default.Delete, contentDescription = "Delete Task") },
            text = { Text("Delete Task", fontFamily = AppFontFamily) },
            onClick = {
                onDeleteTaskClick()
//                viewModel.selectedTaskState.value?.let { task ->
//                    createAlertDialog(
//                        dialogTitle = "Delete Task",
//                        dialogText = "Are you sure you want to delete task '${task.name}'?",
//                        dialogPositiveButtonText = "Delete",
//                        dialogNegativeButtonText = "Cancel",
//                        onPositiveButtonClick = {
//                            viewModel.deleteTask(task.id)
//                            Toast
//                                .makeText(
//                                    context,
//                                    "Task '${task.name}' deleted",
//                                    Toast.LENGTH_LONG,
//                                ).show()
//                        },
//                        onNegativeButtonClick = {},
//                    )
//                }
//                expanded = false
            },
        )
    }
}