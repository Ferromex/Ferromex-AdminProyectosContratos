--------------------------------------------------------
-- Archivo creado  - viernes-abril-04-2014   
--------------------------------------------------------
DROP TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" cascade constraints;
--------------------------------------------------------
--  DDL for Table TPRY_TIPO_DOCUMENTO
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" 
   (	"TDOC_ID" NUMBER, 
	"TDOC_NOMBRE" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
REM INSERTING into REFERENCIA.TPRY_TIPO_DOCUMENTO
SET DEFINE OFF;
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (1,'Carta de Intención');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (2,'Carta Invitación');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (3,'Memorándum');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (4,'Notificación "No Ganador"');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (5,'Oficio de Descalificación');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (11,'Convenio');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (6,'Caratula de Contrato');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (7,'Cuadro Comparativo');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (8,'Convenio Modificatorio');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (9,'Acta de Entrega y Recepción');
Insert into REFERENCIA.TPRY_TIPO_DOCUMENTO (TDOC_ID,TDOC_NOMBRE) values (10,'Contrato');
--------------------------------------------------------
--  DDL for Index TGENTIPO_DOCUMENTO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "REFERENCIA"."TGENTIPO_DOCUMENTO_PK" ON "REFERENCIA"."TPRY_TIPO_DOCUMENTO" ("TDOC_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  Constraints for Table TPRY_TIPO_DOCUMENTO
--------------------------------------------------------

  ALTER TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" ADD CONSTRAINT "PK01_TDOC_ID" PRIMARY KEY ("TDOC_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA"  ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" MODIFY ("TDOC_ID" NOT NULL ENABLE);
