package com.sample.content

import androidx.compose.runtime.*
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import com.sample.components.ContainerInSection
import com.sample.style.*
import org.w3c.dom.HTMLElement

@Composable
fun Intro() {
    ContainerInSection {
        Div({
            classes(WtRows.wtRow, WtRows.wtRowSizeXs, WtRows.wtRowSmAlignItemsCenter)
        }) {

            Div({
                classes(
                    WtCols.wtCol16,
                    WtCols.wtColMd8,
                    //WtCols.wtColSm12,
                    //WtOffsets.wtTopOffsetSm12
                )
            }) {
                Div({
                    classes(WtTexts.wtText1, WtOffsets.wtBottomOffsetSm12)
                }) {
                    Text("Hi, my name is")
                }
                H1(attrs = { classes(WtTexts.wtHero) }) {
                    Span({
                        classes(WtTexts.wtHero)
                        style {
                            display(DisplayStyle.InlineBlock)
                            whiteSpace("nowrap")
                        }
                    }) {
                        Text("Iván Montiel")

//                        Span(attrs = { classes(AppStylesheet.composeTitleTag) }) {
//                            Text("Technology preview")
//                        }
                    }
                }
                Div({
                    classes(WtDisplay.wtDisplayMdNone)
                }) {
                    IntroAboutComposeWeb()
                }
            }
        }


        Div(attrs = {
            classes(WtDisplay.wtDisplayNone, WtDisplay.wtDisplayMdBlock)
        }) {
            IntroAboutComposeWeb()
        }
    }
}

@Composable
private fun IntroAboutComposeWeb() {
    Div({
        classes(WtRows.wtRow, WtRows.wtRowSizeM)
    }) {

        Div({
            classes(WtCols.wtCol9, WtCols.wtColMd9, WtCols.wtColSm12)
        }) {
            P({ classes(WtTexts.wtH2, WtOffsets.wtTopOffset24) }) {
                Text("I love to build things with code")
            }

            P({
                classes(WtTexts.wtText1, WtOffsets.wtTopOffset24)
            }) {
                Text(
                    "I am a software engineer with extensive experience in scalable software design. My ability " +
                            "to solve complex problems and create innovative solutions has been proven in numerous " +
                            "projects I have worked on. I am passionate about software development and I am always " +
                            "looking for new technologies and tools to expand my knowledge."
                )
            }
        }
    }
}

@Composable
private fun IntroCodeSample() {
    Div({
        style {
            marginTop(24.px)
            backgroundColor(rgba(39, 40, 44, 0.05))
            borderRadius(8.px)
            property("font-family", "'JetBrains Mono', monospace")
        }
    }) {
        Div({
            style {
                property("padding", "12px 16px")
            }
        }) {
            FormattedCodeSnippet(
                code = """
                fun greet() = listOf("Hello", "Hallo", "Hola", "Servus").random()

                renderComposable("greetingContainer") {
                    var greeting by remember { mutableStateOf(greet()) }
                    Button(attrs = { onClick { greeting = greet() } }) {
                        Text(greeting)
                    }
                } 
            """.trimIndent()
            )
        }

        Hr({
            style {
                height(1.px)
                border(width = 0.px)
                backgroundColor(rgba(39, 40, 44, 0.15))
            }
        })

        IntroCodeSampleResult()
    }
}

@Composable
private fun IntroCodeSampleResult() {
    Div({
        style {
            property("padding", "12px 16px")
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            alignItems(AlignItems.Center)
        }
    }) {
        Span({
            classes(WtTexts.wtText2)
            style {
                marginRight(8.px)
            }
        }) {
            Text("Result:")
        }

        fun greet() = listOf("Hello", "Hallo", "Hola", "Servus").random()

        Div({
            id("greetingContainer")
        }) {
            var greeting by remember { mutableStateOf(greet()) }
            Button(attrs = { onClick { greeting = greet() } }) {
                Text(greeting)
            }
        }
    }
}

@Composable
private fun ComposeWebStatusMessage() {
    Div({
        classes(WtRows.wtRow, WtRows.wtRowSizeXs, WtOffsets.wtTopOffset24)
    }) {
        Div({
            classes(WtCols.wtColInline)
        }) {
            Img(src = "ic_info.svg", attrs = {
                style {
                    width(24.px)
                    height(24.px)
                }
            })
        }

        Div({
            classes(WtCols.wtColAutoFill)
        }) {
            P({
                classes(WtTexts.wtText3)
            }) {
                Text(
                    "With its current status Technology Preview, Compose for Web " +
                            "is not production-ready, and should only be used in experiments. " +
                            "We are hard at work to bring you great learning materials, tutorials, " +
                            "and documentation, and optimize the performance of Compose for Web in the future!"
                )
            }
        }
    }
}
