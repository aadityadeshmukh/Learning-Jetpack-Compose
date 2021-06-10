# How to add text to an empty activity

- First understand the setContent block
	- SetContent defines the activities layout
	- You dont need to define it in xmls 
	- use [[Composable Functions]] instead
	- Jetpack Compose uses a special compiler to create layout
- Example is a Text function:
	- If you want to add a text function you do so by adding `Text("")` to setContent