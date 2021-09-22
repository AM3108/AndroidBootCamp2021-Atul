package com.example.androidbootcamp2021_atul.excersise2

// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide
// there specific details like rateofinterest etc,print details of every bank.

interface BankDetails {
    val ROI: Double
    val bankName: String
    val bankCity: String

    fun getBankDetails() {
        println("Bank name: $bankName")
        println("Bank city: $bankCity")
        println("Rate of Interest: $ROI\n")
    }

}

class NB: BankDetails {
    override val ROI: Double
        get() = 10.0
    override val bankName: String
        get() = "National Bank"
    override val bankCity: String
        get() = "Kalyan"
}

class PNB: BankDetails {
    override val ROI: Double
        get() = 15.0
    override val bankName: String
        get() = "PNB"
    override val bankCity: String
        get() = "Kalyan(W)"
}

class ICICI: BankDetails {
    override val ROI: Double
        get() = 8.0
    override val bankName: String
        get() = "ICICI"
    override val bankCity: String
        get() = "Kalyan(E)"
}
