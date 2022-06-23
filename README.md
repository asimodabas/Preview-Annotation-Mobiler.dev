# Preview-Annotation-Mobiler.dev

See the blog post of this project [here][0]

-------------

## Project Presentation

<br>

Preview Annotation is a preview feature that came into our lives with the use of Jetpack Compose, which we will use to preview the changes we made in Android Studio.
Thanks to the previews we will make, it allows us to style variable options such as titles, heights, widths, backgrounds, and see the state before rendering, without the need to compile and run our application.

* It's nice to add. To use Preview Annotation, it is enough to activate Compose.

What we will do with the Preview Description:

1)  Adding a Title
2) Adding Height
3) Adding Width
4) Adding Background
5) Preview in Emulator
6) grouping

 DefaultPreview; in the previews you have made; properties such as titles, heights, widths, backgrounds can be changed.
* You can add width using the "widthDp" argument and height using the "heightDp" argument.

If you are satisfied with the design you have made and you want to see this design on the device, you can view it thanks to @Preview without running the Emulator. In such a case, all you have to do is call the "showSystemUi" argument and set its Boolean value to "true".


You will probably have to use multiple previews when creating these previews. Thanks to @Preview, it is also possible to prepare multiple previews and group these previews to switch between them.

```kotlin   
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview(
    showSystemUi = true,
    name = "My Priview",
    showBackground = true,
    widthDp = 125,
    backgroundColor = 0xFFFFFF8D,
    heightDp = 50,
    group = "Profile"
)
@Composable
fun DefaultPreview() {
    Text(text = "Hello World!")
}

@Preview(
    showSystemUi = true,
    name = "My Second Preview",
    showBackground = true,
    widthDp = 125,
    backgroundColor = 0xFF2196F3,
    heightDp = 50,
    group = "Home"
)
@Composable
fun SecondPreview() {
    Text(text = "Hello Android!")
}
```
<br>

<p align="center">
<img src="https://user-images.githubusercontent.com/71982171/175336935-8d699ab5-4d20-4a0d-a6b7-4382aa38a9aa.png" alt="GIF" />
</p>

* Compose does not define any background by itself, but if you want to define it, you can do this by setting the Boolean value of the showBackground argument to true. You can use the backgroundColor to change its color.

<p align="center">
<img src="https://user-images.githubusercontent.com/71982171/175336941-cb96148d-20f9-472a-a90e-d59eb0b2998e.png" alt="GIF" />
</p>




-----------
## And Result
<p align="center">
  <img src="https://user-images.githubusercontent.com/71982171/175336505-feadf096-53d6-42ee-a5e4-b9c67efad68b.png" alt="GIF" />
</p>

[0]: https://www.mobiler.dev/post/jetpack-compose-da-preview-annotation
