/**
 * Generated by typeshare 1.2.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
data class EditItemViewModelSaveRequest (
	val context: String,
	val values: List<EditItemSaveValue>,
	val fill_action: AutoFillItemActionRequest? = null
)

