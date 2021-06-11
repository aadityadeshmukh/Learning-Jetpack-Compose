# Adding images to app
## Source of the image
- Add an `Image` element using the `Image` function
- Need to add a `painterResource`
- Add the resource to project using Resource Manager


## Styling the image
- The Image function takes a modifier argument
- Pass Modifier.height to decide the height of the element
- Pass fillMaxWidth to specify that the image should take the width of the element it bleongs to
- Pass contentScale to specify that the grpahic should fill the width of the column
- contentScale.crop crops the graphic to necessary height

## Spacing

- `Spacer` function adds space with defined `modifier`
- `Modifier.height` adds a vertical spacer

Next up [[Material Theme]]