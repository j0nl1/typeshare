// Code generated by typeshare 1.2.0. DO NOT EDIT.
package proto

import "encoding/json"

type OtherType struct {
}
// This is a comment.
type Person struct {
	Name string `json:"name"`
	Age int `json:"age"`
	ExtraSpecialField1 int `json:"extraSpecialFieldOne"`
	ExtraSpecialField2 *[]string `json:"extraSpecialFieldTwo,omitempty"`
	NonStandardDataType OtherType `json:"nonStandardDataType"`
	NonStandardDataTypeInArray *[]OtherType `json:"nonStandardDataTypeInArray,omitempty"`
}
