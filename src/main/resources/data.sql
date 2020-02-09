DROP TABLE IF EXISTS bicsolene;
 
CREATE TABLE BicSolene (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  idCouleur INT,
  capuchon BOOLEAN NOT NULL,
  bouchon BOOLEAN NOT NULL,
  name VARCHAR(450) NOT NULL,
  idTypeStylo INT NOT NULL
 );




INSERT INTO BicSolene (id,idCouleur, capuchon, bouchon,name,idTypeStylo) VALUES
  (SEQ_BICSOLENE.nextval,1,TRUE,TRUE, 'sasahh', 22),
  (SEQ_BICSOLENE.nextval,2,TRUE,TRUE, 'bsolennn', 5),
  (SEQ_BICSOLENE.nextval,7,FALSE,FALSE, 'bicsolennn',4);