import java.awt.Color;
import java.io.IOException;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;

public class CardsList {
	public static void main(String[] args) throws IOException {
		
		// Create a document and add a page to it
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);

		// Start a new content stream which will "hold" the to be created content
		PDPageContentStream contentStream = new PDPageContentStream(document, page);
		// Set the border color and width
		contentStream.setLineWidth(1);
		contentStream.setStrokingColor(Color.black);
		
		// Initialize array with the cards
		String[] cards = new String[] {"2","3","4","5","6","7","8","9","0","a","s","d","f"};
		
		// Set font and font size
		PDFont font = PDTrueTypeFont.loadTTF(document, "Hoyle Playing Cards.ttf");
		contentStream.setFont(font, 18);
		
		int cardSymbol = 1;
		Boolean color = true;
		int newLine = 0;
		int y = 10;
		int x = 10;
		
		for (String card : cards) {
			for (int i = 0; i < 4; i++) {
				// Check which card symbol to print
				String symbol = "";
				switch (cardSymbol) {
					case 1:
						symbol = "e";
						cardSymbol++;
						break;
					case 2:
						symbol = "w";
						cardSymbol++;
						break;
					case 3:
						symbol = "r";
						cardSymbol++;
						break;
					case 4:
						symbol = "q";
						cardSymbol++;
						break;
					default:
						break;
				}
				
				// Check what color to be
				if(color) {
					contentStream.setNonStrokingColor(Color.RED);
					color = false;
				} else {
					contentStream.setNonStrokingColor(Color.BLACK);
					color = true;
				}
				
				// Draw the text and the border of the card
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(x+15,y+30);
				contentStream.drawString(card + symbol);
				contentStream.endText();
				contentStream.addRect(x, y, 50, 70);
				contentStream.stroke();
				x+=55;
			}
			cardSymbol = 1;
			newLine++;
			// If there are eight cards printed, begin new line
			if(newLine >= 2) {
				newLine = 0;
				y+=75;
				x = 10;
			}
		}
		
		// Make sure that the content stream is closed:
		contentStream.close();

		// Save the results and ensure that the document is properly closed:
		try {
			document.save("Deck-of-cards.pdf");
		} catch (COSVisitorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		document.close();
	}
}
