/**
 * Generated by typeshare 1.1.0-prerelease02
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

typealias OptionalU32 = UInt?

typealias OptionalU16 = UShort?

@Serializable
data class FooBar (
	val foo: OptionalU32,
	val bar: OptionalU16
)
