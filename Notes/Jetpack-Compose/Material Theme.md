# Adding themes to app

- Just wrap the main content with `MaterialTheme{}` block
- Use the `Clip` function to add rounded corners
	- `Clip(Shape = RoundedCornerShape(4.dp))`

## Typography
- Create a variable `Typography` using `MaterialDesign.typography` class
- use this variable to style the `Text` elements
- `Text ("" , style = Typography.h2)`
- use `maxLines` to determine the number of lines the text should span
- use `overflowtext.ellipses` to determine what happens to overflown text
	- ellipses will show 3 dots  `...` for overflown text