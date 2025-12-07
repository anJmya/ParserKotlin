@file:Suppress("ktlint:standard:filename")

package org.example.parser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document =
        Jsoup
            .connect(
                "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/",
            ).get()

    val quotes: Elements = doc.select(".cOOA-do .ccmjFA .bzpNIu")

    for (quote: Element in quotes) {
        println(quote.text())
    }
}
