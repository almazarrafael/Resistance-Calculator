from PyQt5 import QtWidgets
import sys
from design import Ui_MainWindow

class mywindow(QtWidgets.QMainWindow):
    def __init__(self):
        super(mywindow, self).__init__()
        self.ui = Ui_MainWindow()
        self.ui.setupUi(self)
        self.ui.comboBox.currentIndexChanged.connect(self.updateLabel)
        self.ui.comboBox_2.currentIndexChanged.connect(self.updateLabel)
        self.ui.comboBox_3.currentIndexChanged.connect(self.updateLabel)
        self.ui.comboBox_4.currentIndexChanged.connect(self.updateLabel)
        self.ui.comboBox_5.currentIndexChanged.connect(self.updateLabel)
        self.ui.comboBox_6.currentIndexChanged.connect(self.updateLabel)

    def updateLabel (self):
        currentDataArr = [
            str(determineValue(self.ui.comboBox.currentText())),
            str(determineValue(self.ui.comboBox_2.currentText())),
            str(determineValue(self.ui.comboBox_3.currentText())),
            str(determineValue(self.ui.comboBox_4.currentText())),
            str(determineValue(self.ui.comboBox_5.currentText())),
            str(determineValue(self.ui.comboBox_6.currentText()))
        ]

        result = ''
        for i in range(len(currentDataArr)):
            if currentDataArr[i] == '-1':
                continue
            result = result + currentDataArr[i]

        self.ui.label.setText(result + " ohms")

def determineValue (color):
        valueDict = {
            "None": -1,
            "Black": 0,
            "Brown": 1,
            "Red": 2,
            "Orange": 3,
            "Yellow": 4,
            "Green": 5,
            "Blue": 6,
            "Violet": 7,
            "Grey": 8,
            "White": 9
        }
        return valueDict.get(color, 0)

def main ():
    app = QtWidgets.QApplication([])
    application = mywindow()
    application.show()
    sys.exit(app.exec())

if __name__ == '__main__':
    main()