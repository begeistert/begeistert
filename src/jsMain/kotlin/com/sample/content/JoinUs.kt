package com.sample.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import com.sample.components.ContainerInSection
import com.sample.style.*

@Composable
fun JoinUs() {
    ContainerInSection(WtSections.wtSectionBgGrayLight) {
        Div(attrs = {
            classes(WtRows.wtRow, WtRows.wtRowSizeM, WtRows.wtRowSmAlignItemsCenter)
        }) {
            Div(attrs = {
                classes(WtCols.wtCol9, WtCols.wtColMd11, WtCols.wtColSm12)
            }) {

                Div({
                    classes(WtTexts.wtText1, WtOffsets.wtBottomOffsetSm12)
                }) {
                    Text("What's Next?")
                }

                P(attrs = {
                    classes(WtTexts.wtH2)
                }) {
                    Text("Get In Touch")
                }

                P(attrs = {
                    classes(WtTexts.wtText2, WtOffsets.wtTopOffset24)
                }) {
                    Text("Although I'm not currently looking for any new opportunities, my inbox is always open. " +
                            "I enjoy networking and meeting new people, so feel free to reach out to me. In addition " +
                            "to answering any questions you may have, I would be happy to discuss my career experience " +
                            "and goals. Even if you don't have a specific reason for reaching out, I believe that " +
                            "building relationships is always valuable. So don't hesitate to say hi and start a " +
                            "conversation!")
                }
            }
        }

        A(attrs = {
            classes(WtTexts.wtButton, WtTexts.wtButtonContrast, WtOffsets.wtTopOffset24)
            target(ATarget.Blank)
        }, href = "mailto:ivan.montiel.c@gmail.com") {
            Text("Say Hello!")
        }
    }
}

@Composable
private fun LinkToSlack(url: String, text: String) {
    A(href = url, attrs = {
        target(ATarget.Blank)
        classes(WtTexts.wtLink)
    }) {
        Text(text)
    }
}
