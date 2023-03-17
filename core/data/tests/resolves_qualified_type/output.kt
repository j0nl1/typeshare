/**
 * Generated by typeshare 1.2.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
data class QualifiedTypes (
	val unqualified: String,
	val qualified: String,
	val qualified_vec: List<String>,
	val qualified_hashmap: HashMap<String, String>,
	val qualified_optional: String? = null,
	val qualfied_optional_hashmap_vec: HashMap<String, List<String>>? = null
)

