#First Possibility case for the bracket
`""` -> `true` (Empty string)

#Second Possibility case for the bracket
`"["` -> `false` (Single left bracket)

#Third Possibility case for the bracket
`"]"` -> `false` (Single right bracket)

#Forth Possibility case for the bracket
`"`[]`"` -> `true` (Brackets in correct order)

#Five Possibilities case for the bracket
`"]["` -> `false` (Brackets in incorrect order)

#Six Possibilities case for the bracket
`"[[]]"` -> `true` (Nested brackets in correct order)

#Seven Possibilities case for the bracket
 `"][[]"` -> `false` (Nested brackets in incorrect order)

#Heights Possibilities case for the bracket
`"abc[def]ghi"` -> `true` (Brackets with other characters)

#Nine Possibilities case for the bracket
`"[[]"` -> `false` (Unbalanced brackets)

#Ten Possibilities case for the bracket
`"[abc[def]ghi"` -> `false` (Unbalanced brackets with other characters)

#Eleventh Possibilities case for the bracket
`"[abc][def]"` -> `true` (Multiple pairs of brackets in correct order)

#Twelve Possibilities case for the bracket
`"[abc][def]ghi["` -> `false` (Multiple pairs of brackets in incorrect order)