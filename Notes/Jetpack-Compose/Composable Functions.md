# What are composable functions
- Composable functions let you define your UI programatically
- You need to describe the shape and data dependencies
- No need to focus on the process of UI construction


# How do you make a function composable

- Just add an annotation @Composable ahead of a function name

# Key points

- Composable functions can only be called from other Composable functions
- You can preview these composable functions right in the IDE
- No need to download the app to phone or use an emulator
- But you can only preview composable functions if they dont take an argument
- So to bypass this add a dedicated preview function that calls the main composable function

Next up [[Adding text]]
