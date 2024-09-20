package org.xtext.example.process.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.process.services.ProcessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Process'", "'('", "')'", "'<'", "'>'", "'{'", "'}'", "'ActorCategory'", "'codeActeur'", "':'", "','", "'descriptionActeur'", "'acteursConcrets'", "'ConcretActor'", "'TaskSimple'", "'description'", "'TaskComposite'", "'taches'", "'String'", "'Int'", "'Float'", "'Boolean'", "'true'", "'false'", "'CustumParameter'", "'='", "'int'", "'string'", "'float'", "'boolean'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_FLOAT=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalProcessParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProcessParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProcessParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProcess.g"; }



     	private ProcessGrammarAccess grammarAccess;

        public InternalProcessParser(TokenStream input, ProcessGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ProcessGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalProcess.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalProcess.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalProcess.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalProcess.g:71:1: ruleModel returns [EObject current=null] : ( (lv_processus_0_0= ruleProcess ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_processus_0_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:77:2: ( ( (lv_processus_0_0= ruleProcess ) )* )
            // InternalProcess.g:78:2: ( (lv_processus_0_0= ruleProcess ) )*
            {
            // InternalProcess.g:78:2: ( (lv_processus_0_0= ruleProcess ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProcess.g:79:3: (lv_processus_0_0= ruleProcess )
            	    {
            	    // InternalProcess.g:79:3: (lv_processus_0_0= ruleProcess )
            	    // InternalProcess.g:80:4: lv_processus_0_0= ruleProcess
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProcessusProcessParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_processus_0_0=ruleProcess();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"processus",
            	    					lv_processus_0_0,
            	    					"org.xtext.example.process.Process.Process");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcess"
    // InternalProcess.g:100:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalProcess.g:100:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalProcess.g:101:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalProcess.g:107:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* ( (lv_acteurCategories_10_0= ruleActorCategory ) )* ( (lv_taches_11_0= ruleTask ) )* otherlv_12= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_entrees_3_0 = null;

        EObject lv_sorties_6_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_acteurCategories_10_0 = null;

        EObject lv_taches_11_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:113:2: ( (otherlv_0= 'Process' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* ( (lv_acteurCategories_10_0= ruleActorCategory ) )* ( (lv_taches_11_0= ruleTask ) )* otherlv_12= '}' ) )
            // InternalProcess.g:114:2: (otherlv_0= 'Process' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* ( (lv_acteurCategories_10_0= ruleActorCategory ) )* ( (lv_taches_11_0= ruleTask ) )* otherlv_12= '}' )
            {
            // InternalProcess.g:114:2: (otherlv_0= 'Process' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* ( (lv_acteurCategories_10_0= ruleActorCategory ) )* ( (lv_taches_11_0= ruleTask ) )* otherlv_12= '}' )
            // InternalProcess.g:115:3: otherlv_0= 'Process' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* ( (lv_acteurCategories_10_0= ruleActorCategory ) )* ( (lv_taches_11_0= ruleTask ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalProcess.g:119:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:120:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:120:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:121:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getProcessAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProcess.g:137:3: (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProcess.g:138:4: otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalProcess.g:142:4: ( (lv_entrees_3_0= ruleParameter ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==12||LA2_0==19||(LA2_0>=25 && LA2_0<=26)||LA2_0==28||(LA2_0>=30 && LA2_0<=33)||LA2_0==36||(LA2_0>=38 && LA2_0<=41)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalProcess.g:143:5: (lv_entrees_3_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:143:5: (lv_entrees_3_0= ruleParameter )
                    	    // InternalProcess.g:144:6: lv_entrees_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getProcessAccess().getEntreesParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_entrees_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entrees",
                    	    							lv_entrees_3_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProcess.g:166:3: (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProcess.g:167:4: otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalProcess.g:171:4: ( (lv_sorties_6_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12||LA4_0==19||(LA4_0>=25 && LA4_0<=26)||LA4_0==28||(LA4_0>=30 && LA4_0<=33)||LA4_0==36||(LA4_0>=38 && LA4_0<=41)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalProcess.g:172:5: (lv_sorties_6_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:172:5: (lv_sorties_6_0= ruleParameter )
                    	    // InternalProcess.g:173:6: lv_sorties_6_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getProcessAccess().getSortiesParameterParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_sorties_6_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sorties",
                    	    							lv_sorties_6_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProcess.g:199:3: ( (lv_variables_9_0= ruleVariableDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_6 = input.LA(3);

                        if ( (LA6_6==12||(LA6_6>=18 && LA6_6<=19)||(LA6_6>=25 && LA6_6<=26)||LA6_6==28||(LA6_6>=37 && LA6_6<=41)) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_1==42) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        int LA6_7 = input.LA(3);

                        if ( (LA6_7==12||(LA6_7>=18 && LA6_7<=19)||(LA6_7>=25 && LA6_7<=26)||LA6_7==28||(LA6_7>=37 && LA6_7<=41)) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_2==42) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==RULE_ID) ) {
                        int LA6_8 = input.LA(3);

                        if ( (LA6_8==12||(LA6_8>=18 && LA6_8<=19)||(LA6_8>=25 && LA6_8<=26)||LA6_8==28||(LA6_8>=37 && LA6_8<=41)) ) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_3==42) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 12:
                case 25:
                case 38:
                case 39:
                case 40:
                case 41:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalProcess.g:200:4: (lv_variables_9_0= ruleVariableDeclaration )
            	    {
            	    // InternalProcess.g:200:4: (lv_variables_9_0= ruleVariableDeclaration )
            	    // InternalProcess.g:201:5: lv_variables_9_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getVariablesVariableDeclarationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_variables_9_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_9_0,
            	    						"org.xtext.example.process.Process.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalProcess.g:218:3: ( (lv_acteurCategories_10_0= ruleActorCategory ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProcess.g:219:4: (lv_acteurCategories_10_0= ruleActorCategory )
            	    {
            	    // InternalProcess.g:219:4: (lv_acteurCategories_10_0= ruleActorCategory )
            	    // InternalProcess.g:220:5: lv_acteurCategories_10_0= ruleActorCategory
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getActeurCategoriesActorCategoryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_acteurCategories_10_0=ruleActorCategory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"acteurCategories",
            	    						lv_acteurCategories_10_0,
            	    						"org.xtext.example.process.Process.ActorCategory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalProcess.g:237:3: ( (lv_taches_11_0= ruleTask ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProcess.g:238:4: (lv_taches_11_0= ruleTask )
            	    {
            	    // InternalProcess.g:238:4: (lv_taches_11_0= ruleTask )
            	    // InternalProcess.g:239:5: lv_taches_11_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getTachesTaskParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_taches_11_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taches",
            	    						lv_taches_11_0,
            	    						"org.xtext.example.process.Process.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleActorCategory"
    // InternalProcess.g:264:1: entryRuleActorCategory returns [EObject current=null] : iv_ruleActorCategory= ruleActorCategory EOF ;
    public final EObject entryRuleActorCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorCategory = null;


        try {
            // InternalProcess.g:264:54: (iv_ruleActorCategory= ruleActorCategory EOF )
            // InternalProcess.g:265:2: iv_ruleActorCategory= ruleActorCategory EOF
            {
             newCompositeNode(grammarAccess.getActorCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorCategory=ruleActorCategory();

            state._fsp--;

             current =iv_ruleActorCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActorCategory"


    // $ANTLR start "ruleActorCategory"
    // InternalProcess.g:271:1: ruleActorCategory returns [EObject current=null] : (otherlv_0= 'ActorCategory' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'codeActeur' otherlv_4= ':' ( (lv_codeActeur_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )* ( (lv_variables_8_0= ruleVariableDeclaration ) )* otherlv_9= 'descriptionActeur' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleActorCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_codeActeur_5_0=null;
        Token otherlv_6=null;
        Token lv_codeActeurs_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_descriptionActeur_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_variables_8_0 = null;

        EObject lv_acteursConcrets_14_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:277:2: ( (otherlv_0= 'ActorCategory' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'codeActeur' otherlv_4= ':' ( (lv_codeActeur_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )* ( (lv_variables_8_0= ruleVariableDeclaration ) )* otherlv_9= 'descriptionActeur' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )? otherlv_15= '}' ) )
            // InternalProcess.g:278:2: (otherlv_0= 'ActorCategory' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'codeActeur' otherlv_4= ':' ( (lv_codeActeur_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )* ( (lv_variables_8_0= ruleVariableDeclaration ) )* otherlv_9= 'descriptionActeur' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )? otherlv_15= '}' )
            {
            // InternalProcess.g:278:2: (otherlv_0= 'ActorCategory' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'codeActeur' otherlv_4= ':' ( (lv_codeActeur_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )* ( (lv_variables_8_0= ruleVariableDeclaration ) )* otherlv_9= 'descriptionActeur' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )? otherlv_15= '}' )
            // InternalProcess.g:279:3: otherlv_0= 'ActorCategory' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'codeActeur' otherlv_4= ':' ( (lv_codeActeur_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )* ( (lv_variables_8_0= ruleVariableDeclaration ) )* otherlv_9= 'descriptionActeur' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActorCategoryAccess().getActorCategoryKeyword_0());
            		
            // InternalProcess.g:283:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:284:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:284:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:285:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getActorCategoryAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getActorCategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getActorCategoryAccess().getCodeActeurKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getActorCategoryAccess().getColonKeyword_4());
            		
            // InternalProcess.g:313:3: ( (lv_codeActeur_5_0= RULE_STRING ) )
            // InternalProcess.g:314:4: (lv_codeActeur_5_0= RULE_STRING )
            {
            // InternalProcess.g:314:4: (lv_codeActeur_5_0= RULE_STRING )
            // InternalProcess.g:315:5: lv_codeActeur_5_0= RULE_STRING
            {
            lv_codeActeur_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_codeActeur_5_0, grammarAccess.getActorCategoryAccess().getCodeActeurSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"codeActeur",
            						lv_codeActeur_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProcess.g:331:3: (otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProcess.g:332:4: otherlv_6= ',' ( (lv_codeActeurs_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActorCategoryAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalProcess.g:336:4: ( (lv_codeActeurs_7_0= RULE_STRING ) )
            	    // InternalProcess.g:337:5: (lv_codeActeurs_7_0= RULE_STRING )
            	    {
            	    // InternalProcess.g:337:5: (lv_codeActeurs_7_0= RULE_STRING )
            	    // InternalProcess.g:338:6: lv_codeActeurs_7_0= RULE_STRING
            	    {
            	    lv_codeActeurs_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(lv_codeActeurs_7_0, grammarAccess.getActorCategoryAccess().getCodeActeursSTRINGTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActorCategoryRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"codeActeurs",
            	    							lv_codeActeurs_7_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalProcess.g:355:3: ( (lv_variables_8_0= ruleVariableDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12||LA10_0==19||(LA10_0>=25 && LA10_0<=26)||LA10_0==28||(LA10_0>=38 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProcess.g:356:4: (lv_variables_8_0= ruleVariableDeclaration )
            	    {
            	    // InternalProcess.g:356:4: (lv_variables_8_0= ruleVariableDeclaration )
            	    // InternalProcess.g:357:5: lv_variables_8_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getActorCategoryAccess().getVariablesVariableDeclarationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_variables_8_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorCategoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_8_0,
            	    						"org.xtext.example.process.Process.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getActorCategoryAccess().getDescriptionActeurKeyword_8());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getActorCategoryAccess().getColonKeyword_9());
            		
            // InternalProcess.g:382:3: ( (lv_descriptionActeur_11_0= RULE_STRING ) )
            // InternalProcess.g:383:4: (lv_descriptionActeur_11_0= RULE_STRING )
            {
            // InternalProcess.g:383:4: (lv_descriptionActeur_11_0= RULE_STRING )
            // InternalProcess.g:384:5: lv_descriptionActeur_11_0= RULE_STRING
            {
            lv_descriptionActeur_11_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_descriptionActeur_11_0, grammarAccess.getActorCategoryAccess().getDescriptionActeurSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descriptionActeur",
            						lv_descriptionActeur_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProcess.g:400:3: (otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProcess.g:401:4: otherlv_12= 'acteursConcrets' otherlv_13= ':' ( (lv_acteursConcrets_14_0= ruleConcretActor ) )*
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getActorCategoryAccess().getActeursConcretsKeyword_11_0());
                    			
                    otherlv_13=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getActorCategoryAccess().getColonKeyword_11_1());
                    			
                    // InternalProcess.g:409:4: ( (lv_acteursConcrets_14_0= ruleConcretActor ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==25) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProcess.g:410:5: (lv_acteursConcrets_14_0= ruleConcretActor )
                    	    {
                    	    // InternalProcess.g:410:5: (lv_acteursConcrets_14_0= ruleConcretActor )
                    	    // InternalProcess.g:411:6: lv_acteursConcrets_14_0= ruleConcretActor
                    	    {

                    	    						newCompositeNode(grammarAccess.getActorCategoryAccess().getActeursConcretsConcretActorParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_acteursConcrets_14_0=ruleConcretActor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActorCategoryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"acteursConcrets",
                    	    							lv_acteursConcrets_14_0,
                    	    							"org.xtext.example.process.Process.ConcretActor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getActorCategoryAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActorCategory"


    // $ANTLR start "entryRuleConcretActor"
    // InternalProcess.g:437:1: entryRuleConcretActor returns [EObject current=null] : iv_ruleConcretActor= ruleConcretActor EOF ;
    public final EObject entryRuleConcretActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcretActor = null;


        try {
            // InternalProcess.g:437:53: (iv_ruleConcretActor= ruleConcretActor EOF )
            // InternalProcess.g:438:2: iv_ruleConcretActor= ruleConcretActor EOF
            {
             newCompositeNode(grammarAccess.getConcretActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcretActor=ruleConcretActor();

            state._fsp--;

             current =iv_ruleConcretActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcretActor"


    // $ANTLR start "ruleConcretActor"
    // InternalProcess.g:444:1: ruleConcretActor returns [EObject current=null] : (otherlv_0= 'ConcretActor' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'descriptionActeur' otherlv_4= ':' ( (lv_descriptionActeur_5_0= RULE_STRING ) ) ( (lv_variables_6_0= ruleVariableDeclaration ) )* otherlv_7= '}' ) ;
    public final EObject ruleConcretActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descriptionActeur_5_0=null;
        Token otherlv_7=null;
        EObject lv_variables_6_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:450:2: ( (otherlv_0= 'ConcretActor' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'descriptionActeur' otherlv_4= ':' ( (lv_descriptionActeur_5_0= RULE_STRING ) ) ( (lv_variables_6_0= ruleVariableDeclaration ) )* otherlv_7= '}' ) )
            // InternalProcess.g:451:2: (otherlv_0= 'ConcretActor' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'descriptionActeur' otherlv_4= ':' ( (lv_descriptionActeur_5_0= RULE_STRING ) ) ( (lv_variables_6_0= ruleVariableDeclaration ) )* otherlv_7= '}' )
            {
            // InternalProcess.g:451:2: (otherlv_0= 'ConcretActor' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'descriptionActeur' otherlv_4= ':' ( (lv_descriptionActeur_5_0= RULE_STRING ) ) ( (lv_variables_6_0= ruleVariableDeclaration ) )* otherlv_7= '}' )
            // InternalProcess.g:452:3: otherlv_0= 'ConcretActor' ( (lv_identifiant_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'descriptionActeur' otherlv_4= ':' ( (lv_descriptionActeur_5_0= RULE_STRING ) ) ( (lv_variables_6_0= ruleVariableDeclaration ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConcretActorAccess().getConcretActorKeyword_0());
            		
            // InternalProcess.g:456:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:457:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:457:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:458:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getConcretActorAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcretActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getConcretActorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getConcretActorAccess().getDescriptionActeurKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getConcretActorAccess().getColonKeyword_4());
            		
            // InternalProcess.g:486:3: ( (lv_descriptionActeur_5_0= RULE_STRING ) )
            // InternalProcess.g:487:4: (lv_descriptionActeur_5_0= RULE_STRING )
            {
            // InternalProcess.g:487:4: (lv_descriptionActeur_5_0= RULE_STRING )
            // InternalProcess.g:488:5: lv_descriptionActeur_5_0= RULE_STRING
            {
            lv_descriptionActeur_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_descriptionActeur_5_0, grammarAccess.getConcretActorAccess().getDescriptionActeurSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcretActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descriptionActeur",
            						lv_descriptionActeur_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProcess.g:504:3: ( (lv_variables_6_0= ruleVariableDeclaration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12||LA13_0==19||(LA13_0>=25 && LA13_0<=26)||LA13_0==28||(LA13_0>=38 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProcess.g:505:4: (lv_variables_6_0= ruleVariableDeclaration )
            	    {
            	    // InternalProcess.g:505:4: (lv_variables_6_0= ruleVariableDeclaration )
            	    // InternalProcess.g:506:5: lv_variables_6_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getConcretActorAccess().getVariablesVariableDeclarationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_variables_6_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConcretActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_6_0,
            	    						"org.xtext.example.process.Process.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConcretActorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcretActor"


    // $ANTLR start "entryRuleTask"
    // InternalProcess.g:531:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalProcess.g:531:45: (iv_ruleTask= ruleTask EOF )
            // InternalProcess.g:532:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalProcess.g:538:1: ruleTask returns [EObject current=null] : (this_TaskSimple_0= ruleTaskSimple | this_TaskComposite_1= ruleTaskComposite ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        EObject this_TaskSimple_0 = null;

        EObject this_TaskComposite_1 = null;



        	enterRule();

        try {
            // InternalProcess.g:544:2: ( (this_TaskSimple_0= ruleTaskSimple | this_TaskComposite_1= ruleTaskComposite ) )
            // InternalProcess.g:545:2: (this_TaskSimple_0= ruleTaskSimple | this_TaskComposite_1= ruleTaskComposite )
            {
            // InternalProcess.g:545:2: (this_TaskSimple_0= ruleTaskSimple | this_TaskComposite_1= ruleTaskComposite )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalProcess.g:546:3: this_TaskSimple_0= ruleTaskSimple
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getTaskSimpleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskSimple_0=ruleTaskSimple();

                    state._fsp--;


                    			current = this_TaskSimple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:555:3: this_TaskComposite_1= ruleTaskComposite
                    {

                    			newCompositeNode(grammarAccess.getTaskAccess().getTaskCompositeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskComposite_1=ruleTaskComposite();

                    state._fsp--;


                    			current = this_TaskComposite_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskSimple"
    // InternalProcess.g:567:1: entryRuleTaskSimple returns [EObject current=null] : iv_ruleTaskSimple= ruleTaskSimple EOF ;
    public final EObject entryRuleTaskSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskSimple = null;


        try {
            // InternalProcess.g:567:51: (iv_ruleTaskSimple= ruleTaskSimple EOF )
            // InternalProcess.g:568:2: iv_ruleTaskSimple= ruleTaskSimple EOF
            {
             newCompositeNode(grammarAccess.getTaskSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskSimple=ruleTaskSimple();

            state._fsp--;

             current =iv_ruleTaskSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskSimple"


    // $ANTLR start "ruleTaskSimple"
    // InternalProcess.g:574:1: ruleTaskSimple returns [EObject current=null] : (otherlv_0= 'TaskSimple' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )? ( (lv_variables_12_0= ruleVariableDeclaration ) )* otherlv_13= '}' ) ;
    public final EObject ruleTaskSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_descriptionActeur_11_0=null;
        Token otherlv_13=null;
        EObject lv_entrees_3_0 = null;

        EObject lv_sorties_6_0 = null;

        EObject lv_variables_12_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:580:2: ( (otherlv_0= 'TaskSimple' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )? ( (lv_variables_12_0= ruleVariableDeclaration ) )* otherlv_13= '}' ) )
            // InternalProcess.g:581:2: (otherlv_0= 'TaskSimple' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )? ( (lv_variables_12_0= ruleVariableDeclaration ) )* otherlv_13= '}' )
            {
            // InternalProcess.g:581:2: (otherlv_0= 'TaskSimple' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )? ( (lv_variables_12_0= ruleVariableDeclaration ) )* otherlv_13= '}' )
            // InternalProcess.g:582:3: otherlv_0= 'TaskSimple' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )? ( (lv_variables_12_0= ruleVariableDeclaration ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskSimpleAccess().getTaskSimpleKeyword_0());
            		
            // InternalProcess.g:586:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:587:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:587:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:588:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getTaskSimpleAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskSimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProcess.g:604:3: (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProcess.g:605:4: otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskSimpleAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalProcess.g:609:4: ( (lv_entrees_3_0= ruleParameter ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==12||LA15_0==19||(LA15_0>=25 && LA15_0<=26)||LA15_0==28||(LA15_0>=30 && LA15_0<=33)||LA15_0==36||(LA15_0>=38 && LA15_0<=41)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProcess.g:610:5: (lv_entrees_3_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:610:5: (lv_entrees_3_0= ruleParameter )
                    	    // InternalProcess.g:611:6: lv_entrees_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskSimpleAccess().getEntreesParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_entrees_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskSimpleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entrees",
                    	    							lv_entrees_3_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskSimpleAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProcess.g:633:3: (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProcess.g:634:4: otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskSimpleAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalProcess.g:638:4: ( (lv_sorties_6_0= ruleParameter ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==12||LA17_0==19||(LA17_0>=25 && LA17_0<=26)||LA17_0==28||(LA17_0>=30 && LA17_0<=33)||LA17_0==36||(LA17_0>=38 && LA17_0<=41)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalProcess.g:639:5: (lv_sorties_6_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:639:5: (lv_sorties_6_0= ruleParameter )
                    	    // InternalProcess.g:640:6: lv_sorties_6_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskSimpleAccess().getSortiesParameterParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_sorties_6_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskSimpleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sorties",
                    	    							lv_sorties_6_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskSimpleAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskSimpleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProcess.g:666:3: (otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProcess.g:667:4: otherlv_9= 'description' otherlv_10= ':' ( (lv_descriptionActeur_11_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskSimpleAccess().getDescriptionKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskSimpleAccess().getColonKeyword_5_1());
                    			
                    // InternalProcess.g:675:4: ( (lv_descriptionActeur_11_0= RULE_STRING ) )
                    // InternalProcess.g:676:5: (lv_descriptionActeur_11_0= RULE_STRING )
                    {
                    // InternalProcess.g:676:5: (lv_descriptionActeur_11_0= RULE_STRING )
                    // InternalProcess.g:677:6: lv_descriptionActeur_11_0= RULE_STRING
                    {
                    lv_descriptionActeur_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_descriptionActeur_11_0, grammarAccess.getTaskSimpleAccess().getDescriptionActeurSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskSimpleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"descriptionActeur",
                    							lv_descriptionActeur_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProcess.g:694:3: ( (lv_variables_12_0= ruleVariableDeclaration ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12||LA20_0==19||(LA20_0>=25 && LA20_0<=26)||LA20_0==28||(LA20_0>=38 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalProcess.g:695:4: (lv_variables_12_0= ruleVariableDeclaration )
            	    {
            	    // InternalProcess.g:695:4: (lv_variables_12_0= ruleVariableDeclaration )
            	    // InternalProcess.g:696:5: lv_variables_12_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getTaskSimpleAccess().getVariablesVariableDeclarationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_variables_12_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskSimpleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_12_0,
            	    						"org.xtext.example.process.Process.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskSimpleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskSimple"


    // $ANTLR start "entryRuleTaskComposite"
    // InternalProcess.g:721:1: entryRuleTaskComposite returns [EObject current=null] : iv_ruleTaskComposite= ruleTaskComposite EOF ;
    public final EObject entryRuleTaskComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskComposite = null;


        try {
            // InternalProcess.g:721:54: (iv_ruleTaskComposite= ruleTaskComposite EOF )
            // InternalProcess.g:722:2: iv_ruleTaskComposite= ruleTaskComposite EOF
            {
             newCompositeNode(grammarAccess.getTaskCompositeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskComposite=ruleTaskComposite();

            state._fsp--;

             current =iv_ruleTaskComposite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskComposite"


    // $ANTLR start "ruleTaskComposite"
    // InternalProcess.g:728:1: ruleTaskComposite returns [EObject current=null] : (otherlv_0= 'TaskComposite' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= 'taches' ( (lv_taches_14_0= ruleTask ) )* otherlv_15= '}' ) ;
    public final EObject ruleTaskComposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_descriptionActeur_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_entrees_3_0 = null;

        EObject lv_sorties_6_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_taches_14_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:734:2: ( (otherlv_0= 'TaskComposite' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= 'taches' ( (lv_taches_14_0= ruleTask ) )* otherlv_15= '}' ) )
            // InternalProcess.g:735:2: (otherlv_0= 'TaskComposite' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= 'taches' ( (lv_taches_14_0= ruleTask ) )* otherlv_15= '}' )
            {
            // InternalProcess.g:735:2: (otherlv_0= 'TaskComposite' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= 'taches' ( (lv_taches_14_0= ruleTask ) )* otherlv_15= '}' )
            // InternalProcess.g:736:3: otherlv_0= 'TaskComposite' ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )? otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= 'taches' ( (lv_taches_14_0= ruleTask ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskCompositeAccess().getTaskCompositeKeyword_0());
            		
            // InternalProcess.g:740:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:741:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:741:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:742:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getTaskCompositeAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskCompositeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProcess.g:758:3: (otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProcess.g:759:4: otherlv_2= '(' ( (lv_entrees_3_0= ruleParameter ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskCompositeAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalProcess.g:763:4: ( (lv_entrees_3_0= ruleParameter ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==12||LA21_0==19||(LA21_0>=25 && LA21_0<=26)||LA21_0==28||(LA21_0>=30 && LA21_0<=33)||LA21_0==36||(LA21_0>=38 && LA21_0<=41)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProcess.g:764:5: (lv_entrees_3_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:764:5: (lv_entrees_3_0= ruleParameter )
                    	    // InternalProcess.g:765:6: lv_entrees_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskCompositeAccess().getEntreesParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_entrees_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskCompositeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entrees",
                    	    							lv_entrees_3_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskCompositeAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProcess.g:787:3: (otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProcess.g:788:4: otherlv_5= '<' ( (lv_sorties_6_0= ruleParameter ) )* otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskCompositeAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalProcess.g:792:4: ( (lv_sorties_6_0= ruleParameter ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==12||LA23_0==19||(LA23_0>=25 && LA23_0<=26)||LA23_0==28||(LA23_0>=30 && LA23_0<=33)||LA23_0==36||(LA23_0>=38 && LA23_0<=41)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProcess.g:793:5: (lv_sorties_6_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:793:5: (lv_sorties_6_0= ruleParameter )
                    	    // InternalProcess.g:794:6: lv_sorties_6_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskCompositeAccess().getSortiesParameterParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_sorties_6_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskCompositeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sorties",
                    	    							lv_sorties_6_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskCompositeAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskCompositeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProcess.g:820:3: ( (lv_variables_9_0= ruleVariableDeclaration ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12||LA25_0==19||(LA25_0>=25 && LA25_0<=26)||LA25_0==28||(LA25_0>=38 && LA25_0<=41)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProcess.g:821:4: (lv_variables_9_0= ruleVariableDeclaration )
            	    {
            	    // InternalProcess.g:821:4: (lv_variables_9_0= ruleVariableDeclaration )
            	    // InternalProcess.g:822:5: lv_variables_9_0= ruleVariableDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getTaskCompositeAccess().getVariablesVariableDeclarationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_variables_9_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskCompositeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_9_0,
            	    						"org.xtext.example.process.Process.VariableDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalProcess.g:839:3: (otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProcess.g:840:4: otherlv_10= 'description' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskCompositeAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskCompositeAccess().getColonKeyword_6_1());
                    			
                    // InternalProcess.g:848:4: ( (lv_descriptionActeur_12_0= RULE_STRING ) )
                    // InternalProcess.g:849:5: (lv_descriptionActeur_12_0= RULE_STRING )
                    {
                    // InternalProcess.g:849:5: (lv_descriptionActeur_12_0= RULE_STRING )
                    // InternalProcess.g:850:6: lv_descriptionActeur_12_0= RULE_STRING
                    {
                    lv_descriptionActeur_12_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_descriptionActeur_12_0, grammarAccess.getTaskCompositeAccess().getDescriptionActeurSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskCompositeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"descriptionActeur",
                    							lv_descriptionActeur_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskCompositeAccess().getTachesKeyword_7());
            		
            // InternalProcess.g:871:3: ( (lv_taches_14_0= ruleTask ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26||LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProcess.g:872:4: (lv_taches_14_0= ruleTask )
            	    {
            	    // InternalProcess.g:872:4: (lv_taches_14_0= ruleTask )
            	    // InternalProcess.g:873:5: lv_taches_14_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getTaskCompositeAccess().getTachesTaskParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_taches_14_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskCompositeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taches",
            	    						lv_taches_14_0,
            	    						"org.xtext.example.process.Process.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskCompositeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskComposite"


    // $ANTLR start "entryRuleParameter"
    // InternalProcess.g:898:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProcess.g:898:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProcess.g:899:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalProcess.g:905:1: ruleParameter returns [EObject current=null] : (this_SimpleParameter_0= ruleSimpleParameter | this_ComplexParameter_1= ruleComplexParameter ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleParameter_0 = null;

        EObject this_ComplexParameter_1 = null;



        	enterRule();

        try {
            // InternalProcess.g:911:2: ( (this_SimpleParameter_0= ruleSimpleParameter | this_ComplexParameter_1= ruleComplexParameter ) )
            // InternalProcess.g:912:2: (this_SimpleParameter_0= ruleSimpleParameter | this_ComplexParameter_1= ruleComplexParameter )
            {
            // InternalProcess.g:912:2: (this_SimpleParameter_0= ruleSimpleParameter | this_ComplexParameter_1= ruleComplexParameter )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalProcess.g:913:3: this_SimpleParameter_0= ruleSimpleParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getSimpleParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleParameter_0=ruleSimpleParameter();

                    state._fsp--;


                    			current = this_SimpleParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:922:3: this_ComplexParameter_1= ruleComplexParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getComplexParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexParameter_1=ruleComplexParameter();

                    state._fsp--;


                    			current = this_ComplexParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSimpleParameter"
    // InternalProcess.g:934:1: entryRuleSimpleParameter returns [EObject current=null] : iv_ruleSimpleParameter= ruleSimpleParameter EOF ;
    public final EObject entryRuleSimpleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleParameter = null;


        try {
            // InternalProcess.g:934:56: (iv_ruleSimpleParameter= ruleSimpleParameter EOF )
            // InternalProcess.g:935:2: iv_ruleSimpleParameter= ruleSimpleParameter EOF
            {
             newCompositeNode(grammarAccess.getSimpleParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleParameter=ruleSimpleParameter();

            state._fsp--;

             current =iv_ruleSimpleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleParameter"


    // $ANTLR start "ruleSimpleParameter"
    // InternalProcess.g:941:1: ruleSimpleParameter returns [EObject current=null] : (this_StringParameter_0= ruleStringParameter | this_IntParameter_1= ruleIntParameter | this_FloatParameter_2= ruleFloatParameter | this_BooleanParameter_3= ruleBooleanParameter | this_VariableDeclaration_4= ruleVariableDeclaration ) ;
    public final EObject ruleSimpleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_StringParameter_0 = null;

        EObject this_IntParameter_1 = null;

        EObject this_FloatParameter_2 = null;

        EObject this_BooleanParameter_3 = null;

        EObject this_VariableDeclaration_4 = null;



        	enterRule();

        try {
            // InternalProcess.g:947:2: ( (this_StringParameter_0= ruleStringParameter | this_IntParameter_1= ruleIntParameter | this_FloatParameter_2= ruleFloatParameter | this_BooleanParameter_3= ruleBooleanParameter | this_VariableDeclaration_4= ruleVariableDeclaration ) )
            // InternalProcess.g:948:2: (this_StringParameter_0= ruleStringParameter | this_IntParameter_1= ruleIntParameter | this_FloatParameter_2= ruleFloatParameter | this_BooleanParameter_3= ruleBooleanParameter | this_VariableDeclaration_4= ruleVariableDeclaration )
            {
            // InternalProcess.g:948:2: (this_StringParameter_0= ruleStringParameter | this_IntParameter_1= ruleIntParameter | this_FloatParameter_2= ruleFloatParameter | this_BooleanParameter_3= ruleBooleanParameter | this_VariableDeclaration_4= ruleVariableDeclaration )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt29=1;
                }
                break;
            case 31:
                {
                alt29=2;
                }
                break;
            case 32:
                {
                alt29=3;
                }
                break;
            case 33:
                {
                alt29=4;
                }
                break;
            case 12:
            case 19:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalProcess.g:949:3: this_StringParameter_0= ruleStringParameter
                    {

                    			newCompositeNode(grammarAccess.getSimpleParameterAccess().getStringParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringParameter_0=ruleStringParameter();

                    state._fsp--;


                    			current = this_StringParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:958:3: this_IntParameter_1= ruleIntParameter
                    {

                    			newCompositeNode(grammarAccess.getSimpleParameterAccess().getIntParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntParameter_1=ruleIntParameter();

                    state._fsp--;


                    			current = this_IntParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:967:3: this_FloatParameter_2= ruleFloatParameter
                    {

                    			newCompositeNode(grammarAccess.getSimpleParameterAccess().getFloatParameterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatParameter_2=ruleFloatParameter();

                    state._fsp--;


                    			current = this_FloatParameter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProcess.g:976:3: this_BooleanParameter_3= ruleBooleanParameter
                    {

                    			newCompositeNode(grammarAccess.getSimpleParameterAccess().getBooleanParameterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanParameter_3=ruleBooleanParameter();

                    state._fsp--;


                    			current = this_BooleanParameter_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProcess.g:985:3: this_VariableDeclaration_4= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSimpleParameterAccess().getVariableDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_4=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleParameter"


    // $ANTLR start "entryRuleStringParameter"
    // InternalProcess.g:997:1: entryRuleStringParameter returns [EObject current=null] : iv_ruleStringParameter= ruleStringParameter EOF ;
    public final EObject entryRuleStringParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParameter = null;


        try {
            // InternalProcess.g:997:56: (iv_ruleStringParameter= ruleStringParameter EOF )
            // InternalProcess.g:998:2: iv_ruleStringParameter= ruleStringParameter EOF
            {
             newCompositeNode(grammarAccess.getStringParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringParameter=ruleStringParameter();

            state._fsp--;

             current =iv_ruleStringParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringParameter"


    // $ANTLR start "ruleStringParameter"
    // InternalProcess.g:1004:1: ruleStringParameter returns [EObject current=null] : (otherlv_0= 'String' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1010:2: ( (otherlv_0= 'String' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalProcess.g:1011:2: (otherlv_0= 'String' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalProcess.g:1011:2: (otherlv_0= 'String' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalProcess.g:1012:3: otherlv_0= 'String' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStringParameterAccess().getStringKeyword_0());
            		
            // InternalProcess.g:1016:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalProcess.g:1017:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalProcess.g:1017:4: (lv_value_1_0= RULE_STRING )
            // InternalProcess.g:1018:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringParameterAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringParameter"


    // $ANTLR start "entryRuleIntParameter"
    // InternalProcess.g:1038:1: entryRuleIntParameter returns [EObject current=null] : iv_ruleIntParameter= ruleIntParameter EOF ;
    public final EObject entryRuleIntParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntParameter = null;


        try {
            // InternalProcess.g:1038:53: (iv_ruleIntParameter= ruleIntParameter EOF )
            // InternalProcess.g:1039:2: iv_ruleIntParameter= ruleIntParameter EOF
            {
             newCompositeNode(grammarAccess.getIntParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntParameter=ruleIntParameter();

            state._fsp--;

             current =iv_ruleIntParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntParameter"


    // $ANTLR start "ruleIntParameter"
    // InternalProcess.g:1045:1: ruleIntParameter returns [EObject current=null] : (otherlv_0= 'Int' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1051:2: ( (otherlv_0= 'Int' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalProcess.g:1052:2: (otherlv_0= 'Int' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalProcess.g:1052:2: (otherlv_0= 'Int' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalProcess.g:1053:3: otherlv_0= 'Int' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getIntParameterAccess().getIntKeyword_0());
            		
            // InternalProcess.g:1057:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalProcess.g:1058:4: (lv_value_1_0= RULE_INT )
            {
            // InternalProcess.g:1058:4: (lv_value_1_0= RULE_INT )
            // InternalProcess.g:1059:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntParameterAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntParameter"


    // $ANTLR start "entryRuleFloatParameter"
    // InternalProcess.g:1079:1: entryRuleFloatParameter returns [EObject current=null] : iv_ruleFloatParameter= ruleFloatParameter EOF ;
    public final EObject entryRuleFloatParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatParameter = null;


        try {
            // InternalProcess.g:1079:55: (iv_ruleFloatParameter= ruleFloatParameter EOF )
            // InternalProcess.g:1080:2: iv_ruleFloatParameter= ruleFloatParameter EOF
            {
             newCompositeNode(grammarAccess.getFloatParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatParameter=ruleFloatParameter();

            state._fsp--;

             current =iv_ruleFloatParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatParameter"


    // $ANTLR start "ruleFloatParameter"
    // InternalProcess.g:1086:1: ruleFloatParameter returns [EObject current=null] : (otherlv_0= 'Float' ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleFloatParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1092:2: ( (otherlv_0= 'Float' ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalProcess.g:1093:2: (otherlv_0= 'Float' ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalProcess.g:1093:2: (otherlv_0= 'Float' ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalProcess.g:1094:3: otherlv_0= 'Float' ( (lv_value_1_0= RULE_FLOAT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatParameterAccess().getFloatKeyword_0());
            		
            // InternalProcess.g:1098:3: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalProcess.g:1099:4: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalProcess.g:1099:4: (lv_value_1_0= RULE_FLOAT )
            // InternalProcess.g:1100:5: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getFloatParameterAccess().getValueFLOATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.process.Process.FLOAT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatParameter"


    // $ANTLR start "entryRuleBooleanParameter"
    // InternalProcess.g:1120:1: entryRuleBooleanParameter returns [EObject current=null] : iv_ruleBooleanParameter= ruleBooleanParameter EOF ;
    public final EObject entryRuleBooleanParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanParameter = null;


        try {
            // InternalProcess.g:1120:57: (iv_ruleBooleanParameter= ruleBooleanParameter EOF )
            // InternalProcess.g:1121:2: iv_ruleBooleanParameter= ruleBooleanParameter EOF
            {
             newCompositeNode(grammarAccess.getBooleanParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanParameter=ruleBooleanParameter();

            state._fsp--;

             current =iv_ruleBooleanParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanParameter"


    // $ANTLR start "ruleBooleanParameter"
    // InternalProcess.g:1127:1: ruleBooleanParameter returns [EObject current=null] : (otherlv_0= 'Boolean' ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) ;
    public final EObject ruleBooleanParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalProcess.g:1133:2: ( (otherlv_0= 'Boolean' ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) )
            // InternalProcess.g:1134:2: (otherlv_0= 'Boolean' ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            {
            // InternalProcess.g:1134:2: (otherlv_0= 'Boolean' ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
            // InternalProcess.g:1135:3: otherlv_0= 'Boolean' ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanParameterAccess().getBooleanKeyword_0());
            		
            // InternalProcess.g:1139:3: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
            // InternalProcess.g:1140:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            {
            // InternalProcess.g:1140:4: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
            // InternalProcess.g:1141:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            {
            // InternalProcess.g:1141:5: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            else if ( (LA30_0==35) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalProcess.g:1142:6: lv_value_1_1= 'true'
                    {
                    lv_value_1_1=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBooleanParameterAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanParameterRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1153:6: lv_value_1_2= 'false'
                    {
                    lv_value_1_2=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getBooleanParameterAccess().getValueFalseKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanParameterRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanParameter"


    // $ANTLR start "entryRuleComplexParameter"
    // InternalProcess.g:1170:1: entryRuleComplexParameter returns [EObject current=null] : iv_ruleComplexParameter= ruleComplexParameter EOF ;
    public final EObject entryRuleComplexParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexParameter = null;


        try {
            // InternalProcess.g:1170:57: (iv_ruleComplexParameter= ruleComplexParameter EOF )
            // InternalProcess.g:1171:2: iv_ruleComplexParameter= ruleComplexParameter EOF
            {
             newCompositeNode(grammarAccess.getComplexParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexParameter=ruleComplexParameter();

            state._fsp--;

             current =iv_ruleComplexParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexParameter"


    // $ANTLR start "ruleComplexParameter"
    // InternalProcess.g:1177:1: ruleComplexParameter returns [EObject current=null] : (this_Process_0= ruleProcess | this_TaskSimple_1= ruleTaskSimple | this_TaskComposite_2= ruleTaskComposite | this_ActorCategory_3= ruleActorCategory | this_ConcretActor_4= ruleConcretActor | this_CustumParameter_5= ruleCustumParameter ) ;
    public final EObject ruleComplexParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Process_0 = null;

        EObject this_TaskSimple_1 = null;

        EObject this_TaskComposite_2 = null;

        EObject this_ActorCategory_3 = null;

        EObject this_ConcretActor_4 = null;

        EObject this_CustumParameter_5 = null;



        	enterRule();

        try {
            // InternalProcess.g:1183:2: ( (this_Process_0= ruleProcess | this_TaskSimple_1= ruleTaskSimple | this_TaskComposite_2= ruleTaskComposite | this_ActorCategory_3= ruleActorCategory | this_ConcretActor_4= ruleConcretActor | this_CustumParameter_5= ruleCustumParameter ) )
            // InternalProcess.g:1184:2: (this_Process_0= ruleProcess | this_TaskSimple_1= ruleTaskSimple | this_TaskComposite_2= ruleTaskComposite | this_ActorCategory_3= ruleActorCategory | this_ConcretActor_4= ruleConcretActor | this_CustumParameter_5= ruleCustumParameter )
            {
            // InternalProcess.g:1184:2: (this_Process_0= ruleProcess | this_TaskSimple_1= ruleTaskSimple | this_TaskComposite_2= ruleTaskComposite | this_ActorCategory_3= ruleActorCategory | this_ConcretActor_4= ruleConcretActor | this_CustumParameter_5= ruleCustumParameter )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt31=1;
                }
                break;
            case 26:
                {
                alt31=2;
                }
                break;
            case 28:
                {
                alt31=3;
                }
                break;
            case 19:
                {
                alt31=4;
                }
                break;
            case 25:
                {
                alt31=5;
                }
                break;
            case 36:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalProcess.g:1185:3: this_Process_0= ruleProcess
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Process_0=ruleProcess();

                    state._fsp--;


                    			current = this_Process_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1194:3: this_TaskSimple_1= ruleTaskSimple
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getTaskSimpleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskSimple_1=ruleTaskSimple();

                    state._fsp--;


                    			current = this_TaskSimple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1203:3: this_TaskComposite_2= ruleTaskComposite
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getTaskCompositeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskComposite_2=ruleTaskComposite();

                    state._fsp--;


                    			current = this_TaskComposite_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProcess.g:1212:3: this_ActorCategory_3= ruleActorCategory
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getActorCategoryParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActorCategory_3=ruleActorCategory();

                    state._fsp--;


                    			current = this_ActorCategory_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProcess.g:1221:3: this_ConcretActor_4= ruleConcretActor
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getConcretActorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConcretActor_4=ruleConcretActor();

                    state._fsp--;


                    			current = this_ConcretActor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalProcess.g:1230:3: this_CustumParameter_5= ruleCustumParameter
                    {

                    			newCompositeNode(grammarAccess.getComplexParameterAccess().getCustumParameterParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustumParameter_5=ruleCustumParameter();

                    state._fsp--;


                    			current = this_CustumParameter_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexParameter"


    // $ANTLR start "entryRuleCustumParameter"
    // InternalProcess.g:1242:1: entryRuleCustumParameter returns [EObject current=null] : iv_ruleCustumParameter= ruleCustumParameter EOF ;
    public final EObject entryRuleCustumParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustumParameter = null;


        try {
            // InternalProcess.g:1242:56: (iv_ruleCustumParameter= ruleCustumParameter EOF )
            // InternalProcess.g:1243:2: iv_ruleCustumParameter= ruleCustumParameter EOF
            {
             newCompositeNode(grammarAccess.getCustumParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustumParameter=ruleCustumParameter();

            state._fsp--;

             current =iv_ruleCustumParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustumParameter"


    // $ANTLR start "ruleCustumParameter"
    // InternalProcess.g:1249:1: ruleCustumParameter returns [EObject current=null] : (otherlv_0= 'CustumParameter' ( (lv_nomParametre_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )? (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )? ) ;
    public final EObject ruleCustumParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomParametre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_descriptionActeur_12_0=null;
        Token otherlv_13=null;
        EObject lv_parametresEntree_3_0 = null;

        EObject lv_parametresSortie_6_0 = null;

        EObject lv_variables_9_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:1255:2: ( (otherlv_0= 'CustumParameter' ( (lv_nomParametre_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )? (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )? ) )
            // InternalProcess.g:1256:2: (otherlv_0= 'CustumParameter' ( (lv_nomParametre_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )? (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )? )
            {
            // InternalProcess.g:1256:2: (otherlv_0= 'CustumParameter' ( (lv_nomParametre_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )? (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )? )
            // InternalProcess.g:1257:3: otherlv_0= 'CustumParameter' ( (lv_nomParametre_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )? (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )? (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustumParameterAccess().getCustumParameterKeyword_0());
            		
            // InternalProcess.g:1261:3: ( (lv_nomParametre_1_0= RULE_ID ) )
            // InternalProcess.g:1262:4: (lv_nomParametre_1_0= RULE_ID )
            {
            // InternalProcess.g:1262:4: (lv_nomParametre_1_0= RULE_ID )
            // InternalProcess.g:1263:5: lv_nomParametre_1_0= RULE_ID
            {
            lv_nomParametre_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_nomParametre_1_0, grammarAccess.getCustumParameterAccess().getNomParametreIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustumParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nomParametre",
            						lv_nomParametre_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProcess.g:1279:3: (otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProcess.g:1280:4: otherlv_2= '(' ( (lv_parametresEntree_3_0= ruleParameter ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getCustumParameterAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalProcess.g:1284:4: ( (lv_parametresEntree_3_0= ruleParameter ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==12||LA32_0==19||(LA32_0>=25 && LA32_0<=26)||LA32_0==28||(LA32_0>=30 && LA32_0<=33)||LA32_0==36||(LA32_0>=38 && LA32_0<=41)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalProcess.g:1285:5: (lv_parametresEntree_3_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:1285:5: (lv_parametresEntree_3_0= ruleParameter )
                    	    // InternalProcess.g:1286:6: lv_parametresEntree_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustumParameterAccess().getParametresEntreeParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_parametresEntree_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCustumParameterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parametresEntree",
                    	    							lv_parametresEntree_3_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustumParameterAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProcess.g:1308:3: (otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProcess.g:1309:4: otherlv_5= '<' ( (lv_parametresSortie_6_0= ruleParameter ) )* otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustumParameterAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalProcess.g:1313:4: ( (lv_parametresSortie_6_0= ruleParameter ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==12||LA34_0==19||(LA34_0>=25 && LA34_0<=26)||LA34_0==28||(LA34_0>=30 && LA34_0<=33)||LA34_0==36||(LA34_0>=38 && LA34_0<=41)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalProcess.g:1314:5: (lv_parametresSortie_6_0= ruleParameter )
                    	    {
                    	    // InternalProcess.g:1314:5: (lv_parametresSortie_6_0= ruleParameter )
                    	    // InternalProcess.g:1315:6: lv_parametresSortie_6_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustumParameterAccess().getParametresSortieParameterParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_parametresSortie_6_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCustumParameterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parametresSortie",
                    	    							lv_parametresSortie_6_0,
                    	    							"org.xtext.example.process.Process.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getCustumParameterAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalProcess.g:1337:3: (otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProcess.g:1338:4: otherlv_8= '{' ( (lv_variables_9_0= ruleVariableDeclaration ) )* (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )? otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustumParameterAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalProcess.g:1342:4: ( (lv_variables_9_0= ruleVariableDeclaration ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==12||LA36_0==19||(LA36_0>=25 && LA36_0<=26)||LA36_0==28||(LA36_0>=38 && LA36_0<=41)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalProcess.g:1343:5: (lv_variables_9_0= ruleVariableDeclaration )
                    	    {
                    	    // InternalProcess.g:1343:5: (lv_variables_9_0= ruleVariableDeclaration )
                    	    // InternalProcess.g:1344:6: lv_variables_9_0= ruleVariableDeclaration
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustumParameterAccess().getVariablesVariableDeclarationParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_variables_9_0=ruleVariableDeclaration();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCustumParameterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"org.xtext.example.process.Process.VariableDeclaration");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // InternalProcess.g:1361:4: (otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==23) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalProcess.g:1362:5: otherlv_10= 'descriptionActeur' otherlv_11= ':' ( (lv_descriptionActeur_12_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,23,FOLLOW_14); 

                            					newLeafNode(otherlv_10, grammarAccess.getCustumParameterAccess().getDescriptionActeurKeyword_4_2_0());
                            				
                            otherlv_11=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_11, grammarAccess.getCustumParameterAccess().getColonKeyword_4_2_1());
                            				
                            // InternalProcess.g:1370:5: ( (lv_descriptionActeur_12_0= RULE_STRING ) )
                            // InternalProcess.g:1371:6: (lv_descriptionActeur_12_0= RULE_STRING )
                            {
                            // InternalProcess.g:1371:6: (lv_descriptionActeur_12_0= RULE_STRING )
                            // InternalProcess.g:1372:7: lv_descriptionActeur_12_0= RULE_STRING
                            {
                            lv_descriptionActeur_12_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                            							newLeafNode(lv_descriptionActeur_12_0, grammarAccess.getCustumParameterAccess().getDescriptionActeurSTRINGTerminalRuleCall_4_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCustumParameterRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"descriptionActeur",
                            								lv_descriptionActeur_12_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getCustumParameterAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustumParameter"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalProcess.g:1398:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalProcess.g:1398:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalProcess.g:1399:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalProcess.g:1405:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_identifiant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalProcess.g:1411:2: ( ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )? ) )
            // InternalProcess.g:1412:2: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )? )
            {
            // InternalProcess.g:1412:2: ( ( (lv_type_0_0= ruleVariableType ) ) ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )? )
            // InternalProcess.g:1413:3: ( (lv_type_0_0= ruleVariableType ) ) ( (lv_identifiant_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )?
            {
            // InternalProcess.g:1413:3: ( (lv_type_0_0= ruleVariableType ) )
            // InternalProcess.g:1414:4: (lv_type_0_0= ruleVariableType )
            {
            // InternalProcess.g:1414:4: (lv_type_0_0= ruleVariableType )
            // InternalProcess.g:1415:5: lv_type_0_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeVariableTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.process.Process.VariableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProcess.g:1432:3: ( (lv_identifiant_1_0= RULE_ID ) )
            // InternalProcess.g:1433:4: (lv_identifiant_1_0= RULE_ID )
            {
            // InternalProcess.g:1433:4: (lv_identifiant_1_0= RULE_ID )
            // InternalProcess.g:1434:5: lv_identifiant_1_0= RULE_ID
            {
            lv_identifiant_1_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_identifiant_1_0, grammarAccess.getVariableDeclarationAccess().getIdentifiantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"identifiant",
            						lv_identifiant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProcess.g:1450:3: (otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProcess.g:1451:4: otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalProcess.g:1455:4: ( (lv_value_3_0= ruleExpression ) )
                    // InternalProcess.g:1456:5: (lv_value_3_0= ruleExpression )
                    {
                    // InternalProcess.g:1456:5: (lv_value_3_0= ruleExpression )
                    // InternalProcess.g:1457:6: lv_value_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_value_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.example.process.Process.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProcess.g:1474:4: (otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==22) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalProcess.g:1475:5: otherlv_4= ',' ( (lv_value_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_33); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalProcess.g:1479:5: ( (lv_value_5_0= ruleExpression ) )
                    	    // InternalProcess.g:1480:6: (lv_value_5_0= ruleExpression )
                    	    {
                    	    // InternalProcess.g:1480:6: (lv_value_5_0= ruleExpression )
                    	    // InternalProcess.g:1481:7: lv_value_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueExpressionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_value_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"value",
                    	    								lv_value_5_0,
                    	    								"org.xtext.example.process.Process.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableType"
    // InternalProcess.g:1504:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalProcess.g:1504:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalProcess.g:1505:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalProcess.g:1511:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleVariableType_0= ruleSimpleVariableType | this_ComplexVariableType_1= ruleComplexVariableType | this_ArrayType_2= ruleArrayType ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleVariableType_0 = null;

        AntlrDatatypeRuleToken this_ComplexVariableType_1 = null;

        AntlrDatatypeRuleToken this_ArrayType_2 = null;



        	enterRule();

        try {
            // InternalProcess.g:1517:2: ( (this_SimpleVariableType_0= ruleSimpleVariableType | this_ComplexVariableType_1= ruleComplexVariableType | this_ArrayType_2= ruleArrayType ) )
            // InternalProcess.g:1518:2: (this_SimpleVariableType_0= ruleSimpleVariableType | this_ComplexVariableType_1= ruleComplexVariableType | this_ArrayType_2= ruleArrayType )
            {
            // InternalProcess.g:1518:2: (this_SimpleVariableType_0= ruleSimpleVariableType | this_ComplexVariableType_1= ruleComplexVariableType | this_ArrayType_2= ruleArrayType )
            int alt41=3;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalProcess.g:1519:3: this_SimpleVariableType_0= ruleSimpleVariableType
                    {

                    			newCompositeNode(grammarAccess.getVariableTypeAccess().getSimpleVariableTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleVariableType_0=ruleSimpleVariableType();

                    state._fsp--;


                    			current.merge(this_SimpleVariableType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1530:3: this_ComplexVariableType_1= ruleComplexVariableType
                    {

                    			newCompositeNode(grammarAccess.getVariableTypeAccess().getComplexVariableTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexVariableType_1=ruleComplexVariableType();

                    state._fsp--;


                    			current.merge(this_ComplexVariableType_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1541:3: this_ArrayType_2= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getVariableTypeAccess().getArrayTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_2=ruleArrayType();

                    state._fsp--;


                    			current.merge(this_ArrayType_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleSimpleVariableType"
    // InternalProcess.g:1555:1: entryRuleSimpleVariableType returns [String current=null] : iv_ruleSimpleVariableType= ruleSimpleVariableType EOF ;
    public final String entryRuleSimpleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleVariableType = null;


        try {
            // InternalProcess.g:1555:58: (iv_ruleSimpleVariableType= ruleSimpleVariableType EOF )
            // InternalProcess.g:1556:2: iv_ruleSimpleVariableType= ruleSimpleVariableType EOF
            {
             newCompositeNode(grammarAccess.getSimpleVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleVariableType=ruleSimpleVariableType();

            state._fsp--;

             current =iv_ruleSimpleVariableType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleVariableType"


    // $ANTLR start "ruleSimpleVariableType"
    // InternalProcess.g:1562:1: ruleSimpleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'float' | kw= 'boolean' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalProcess.g:1568:2: ( (kw= 'int' | kw= 'string' | kw= 'float' | kw= 'boolean' ) )
            // InternalProcess.g:1569:2: (kw= 'int' | kw= 'string' | kw= 'float' | kw= 'boolean' )
            {
            // InternalProcess.g:1569:2: (kw= 'int' | kw= 'string' | kw= 'float' | kw= 'boolean' )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt42=1;
                }
                break;
            case 39:
                {
                alt42=2;
                }
                break;
            case 40:
                {
                alt42=3;
                }
                break;
            case 41:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalProcess.g:1570:3: kw= 'int'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleVariableTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1576:3: kw= 'string'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleVariableTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1582:3: kw= 'float'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleVariableTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalProcess.g:1588:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSimpleVariableTypeAccess().getBooleanKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleVariableType"


    // $ANTLR start "entryRuleComplexVariableType"
    // InternalProcess.g:1597:1: entryRuleComplexVariableType returns [String current=null] : iv_ruleComplexVariableType= ruleComplexVariableType EOF ;
    public final String entryRuleComplexVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexVariableType = null;


        try {
            // InternalProcess.g:1597:59: (iv_ruleComplexVariableType= ruleComplexVariableType EOF )
            // InternalProcess.g:1598:2: iv_ruleComplexVariableType= ruleComplexVariableType EOF
            {
             newCompositeNode(grammarAccess.getComplexVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexVariableType=ruleComplexVariableType();

            state._fsp--;

             current =iv_ruleComplexVariableType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexVariableType"


    // $ANTLR start "ruleComplexVariableType"
    // InternalProcess.g:1604:1: ruleComplexVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Process' | kw= 'TaskSimple' | kw= 'TaskComposite' | kw= 'ActorCategory' | kw= 'ConcretActor' ) ;
    public final AntlrDatatypeRuleToken ruleComplexVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalProcess.g:1610:2: ( (kw= 'Process' | kw= 'TaskSimple' | kw= 'TaskComposite' | kw= 'ActorCategory' | kw= 'ConcretActor' ) )
            // InternalProcess.g:1611:2: (kw= 'Process' | kw= 'TaskSimple' | kw= 'TaskComposite' | kw= 'ActorCategory' | kw= 'ConcretActor' )
            {
            // InternalProcess.g:1611:2: (kw= 'Process' | kw= 'TaskSimple' | kw= 'TaskComposite' | kw= 'ActorCategory' | kw= 'ConcretActor' )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt43=1;
                }
                break;
            case 26:
                {
                alt43=2;
                }
                break;
            case 28:
                {
                alt43=3;
                }
                break;
            case 19:
                {
                alt43=4;
                }
                break;
            case 25:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalProcess.g:1612:3: kw= 'Process'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComplexVariableTypeAccess().getProcessKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1618:3: kw= 'TaskSimple'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComplexVariableTypeAccess().getTaskSimpleKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1624:3: kw= 'TaskComposite'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComplexVariableTypeAccess().getTaskCompositeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalProcess.g:1630:3: kw= 'ActorCategory'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComplexVariableTypeAccess().getActorCategoryKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalProcess.g:1636:3: kw= 'ConcretActor'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComplexVariableTypeAccess().getConcretActorKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexVariableType"


    // $ANTLR start "entryRuleArrayType"
    // InternalProcess.g:1645:1: entryRuleArrayType returns [String current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final String entryRuleArrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayType = null;


        try {
            // InternalProcess.g:1645:49: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalProcess.g:1646:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalProcess.g:1652:1: ruleArrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' ) | (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleArrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleVariableType_0 = null;

        AntlrDatatypeRuleToken this_ComplexVariableType_3 = null;



        	enterRule();

        try {
            // InternalProcess.g:1658:2: ( ( (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' ) | (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' ) ) )
            // InternalProcess.g:1659:2: ( (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' ) | (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' ) )
            {
            // InternalProcess.g:1659:2: ( (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' ) | (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=38 && LA44_0<=41)) ) {
                alt44=1;
            }
            else if ( (LA44_0==12||LA44_0==19||(LA44_0>=25 && LA44_0<=26)||LA44_0==28) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalProcess.g:1660:3: (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' )
                    {
                    // InternalProcess.g:1660:3: (this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']' )
                    // InternalProcess.g:1661:4: this_SimpleVariableType_0= ruleSimpleVariableType kw= '[' kw= ']'
                    {

                    				newCompositeNode(grammarAccess.getArrayTypeAccess().getSimpleVariableTypeParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_35);
                    this_SimpleVariableType_0=ruleSimpleVariableType();

                    state._fsp--;


                    				current.merge(this_SimpleVariableType_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,42,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_1());
                    			
                    kw=(Token)match(input,43,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProcess.g:1683:3: (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' )
                    {
                    // InternalProcess.g:1683:3: (this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']' )
                    // InternalProcess.g:1684:4: this_ComplexVariableType_3= ruleComplexVariableType kw= '[' kw= ']'
                    {

                    				newCompositeNode(grammarAccess.getArrayTypeAccess().getComplexVariableTypeParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_35);
                    this_ComplexVariableType_3=ruleComplexVariableType();

                    state._fsp--;


                    				current.merge(this_ComplexVariableType_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,42,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    kw=(Token)match(input,43,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleExpression"
    // InternalProcess.g:1709:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalProcess.g:1709:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalProcess.g:1710:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalProcess.g:1716:1: ruleExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ArrayAccess_2= ruleArrayAccess ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_ArrayAccess_2 = null;



        	enterRule();

        try {
            // InternalProcess.g:1722:2: ( (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ArrayAccess_2= ruleArrayAccess ) )
            // InternalProcess.g:1723:2: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ArrayAccess_2= ruleArrayAccess )
            {
            // InternalProcess.g:1723:2: (this_Literal_0= ruleLiteral | this_VariableReference_1= ruleVariableReference | this_ArrayAccess_2= ruleArrayAccess )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_FLOAT)||(LA45_0>=34 && LA45_0<=35)) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==42) ) {
                    alt45=3;
                }
                else if ( (LA45_2==EOF||LA45_2==12||LA45_2==14||LA45_2==16||(LA45_2>=18 && LA45_2<=19)||(LA45_2>=22 && LA45_2<=23)||(LA45_2>=25 && LA45_2<=33)||LA45_2==36||(LA45_2>=38 && LA45_2<=41)) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalProcess.g:1724:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1733:3: this_VariableReference_1= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1742:3: this_ArrayAccess_2= ruleArrayAccess
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getArrayAccessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayAccess_2=ruleArrayAccess();

                    state._fsp--;


                    			current = this_ArrayAccess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalProcess.g:1754:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalProcess.g:1754:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalProcess.g:1755:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalProcess.g:1761:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;



        	enterRule();

        try {
            // InternalProcess.g:1767:2: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // InternalProcess.g:1768:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // InternalProcess.g:1768:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt46=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
                {
                alt46=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt46=3;
                }
                break;
            case 34:
            case 35:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalProcess.g:1769:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1778:3: this_IntLiteral_1= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProcess.g:1787:3: this_FloatLiteral_2= ruleFloatLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_2=ruleFloatLiteral();

                    state._fsp--;


                    			current = this_FloatLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProcess.g:1796:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalProcess.g:1808:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalProcess.g:1808:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalProcess.g:1809:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalProcess.g:1815:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1821:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalProcess.g:1822:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalProcess.g:1822:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalProcess.g:1823:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalProcess.g:1823:3: (lv_value_0_0= RULE_STRING )
            // InternalProcess.g:1824:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalProcess.g:1843:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalProcess.g:1843:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalProcess.g:1844:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalProcess.g:1850:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1856:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalProcess.g:1857:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalProcess.g:1857:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalProcess.g:1858:3: (lv_value_0_0= RULE_INT )
            {
            // InternalProcess.g:1858:3: (lv_value_0_0= RULE_INT )
            // InternalProcess.g:1859:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalProcess.g:1878:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalProcess.g:1878:53: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalProcess.g:1879:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
             newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;

             current =iv_ruleFloatLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalProcess.g:1885:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1891:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalProcess.g:1892:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalProcess.g:1892:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalProcess.g:1893:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalProcess.g:1893:3: (lv_value_0_0= RULE_FLOAT )
            // InternalProcess.g:1894:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFloatLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.process.Process.FLOAT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalProcess.g:1913:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalProcess.g:1913:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalProcess.g:1914:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalProcess.g:1920:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalProcess.g:1926:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalProcess.g:1927:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalProcess.g:1927:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalProcess.g:1928:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalProcess.g:1928:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalProcess.g:1929:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalProcess.g:1929:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            else if ( (LA47_0==35) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalProcess.g:1930:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalProcess.g:1941:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalProcess.g:1957:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalProcess.g:1957:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalProcess.g:1958:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalProcess.g:1964:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalProcess.g:1970:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalProcess.g:1971:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalProcess.g:1971:2: ( (otherlv_0= RULE_ID ) )
            // InternalProcess.g:1972:3: (otherlv_0= RULE_ID )
            {
            // InternalProcess.g:1972:3: (otherlv_0= RULE_ID )
            // InternalProcess.g:1973:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVariableVariableDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleArrayAccess"
    // InternalProcess.g:1987:1: entryRuleArrayAccess returns [EObject current=null] : iv_ruleArrayAccess= ruleArrayAccess EOF ;
    public final EObject entryRuleArrayAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAccess = null;


        try {
            // InternalProcess.g:1987:52: (iv_ruleArrayAccess= ruleArrayAccess EOF )
            // InternalProcess.g:1988:2: iv_ruleArrayAccess= ruleArrayAccess EOF
            {
             newCompositeNode(grammarAccess.getArrayAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayAccess=ruleArrayAccess();

            state._fsp--;

             current =iv_ruleArrayAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayAccess"


    // $ANTLR start "ruleArrayAccess"
    // InternalProcess.g:1994:1: ruleArrayAccess returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' ) ;
    public final EObject ruleArrayAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalProcess.g:2000:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' ) )
            // InternalProcess.g:2001:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )
            {
            // InternalProcess.g:2001:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )
            // InternalProcess.g:2002:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']'
            {
            // InternalProcess.g:2002:3: ( (otherlv_0= RULE_ID ) )
            // InternalProcess.g:2003:4: (otherlv_0= RULE_ID )
            {
            // InternalProcess.g:2003:4: (otherlv_0= RULE_ID )
            // InternalProcess.g:2004:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayAccessRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getArrayAccessAccess().getArrayVariableDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalProcess.g:2019:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalProcess.g:2020:4: (lv_index_2_0= RULE_INT )
            {
            // InternalProcess.g:2020:4: (lv_index_2_0= RULE_INT )
            // InternalProcess.g:2021:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_index_2_0, grammarAccess.getArrayAccessAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayAccess"

    // Delegated rules


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\10\uffff\5\1";
    static final String dfa_3s = "\1\14\1\uffff\5\4\1\uffff\5\14";
    static final String dfa_4s = "\1\51\1\uffff\5\52\1\uffff\5\51";
    static final String dfa_5s = "\1\uffff\1\1\5\uffff\1\2\5\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\6\uffff\1\5\5\uffff\1\6\1\3\1\uffff\1\4\1\uffff\4\1\2\uffff\1\7\1\uffff\4\1",
            "",
            "\1\10\45\uffff\1\1",
            "\1\11\45\uffff\1\1",
            "\1\12\45\uffff\1\1",
            "\1\13\45\uffff\1\1",
            "\1\14\45\uffff\1\1",
            "",
            "\1\1\1\7\1\1\1\7\1\1\1\7\1\uffff\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\6\1",
            "\1\1\1\7\1\1\1\7\1\1\1\7\1\uffff\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\6\1",
            "\1\1\1\7\1\1\1\7\1\1\1\7\1\uffff\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\6\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\7\1\uffff\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\6\1",
            "\1\1\1\uffff\1\1\1\uffff\1\1\1\7\1\uffff\1\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\2\uffff\6\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "912:2: (this_SimpleParameter_0= ruleSimpleParameter | this_ComplexParameter_1= ruleComplexParameter )";
        }
    }
    static final String dfa_8s = "\1\uffff\4\13\5\14\3\uffff";
    static final String dfa_9s = "\1\14\11\4\3\uffff";
    static final String dfa_10s = "\1\51\11\52\3\uffff";
    static final String dfa_11s = "\12\uffff\1\3\1\1\1\2";
    static final String[] dfa_12s = {
            "\1\5\6\uffff\1\10\5\uffff\1\11\1\6\1\uffff\1\7\11\uffff\1\1\1\2\1\3\1\4",
            "\1\13\45\uffff\1\12",
            "\1\13\45\uffff\1\12",
            "\1\13\45\uffff\1\12",
            "\1\13\45\uffff\1\12",
            "\1\14\45\uffff\1\12",
            "\1\14\45\uffff\1\12",
            "\1\14\45\uffff\1\12",
            "\1\14\45\uffff\1\12",
            "\1\14\45\uffff\1\12",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1518:2: (this_SimpleVariableType_0= ruleSimpleVariableType | this_ComplexVariableType_1= ruleComplexVariableType | this_ArrayType_2= ruleArrayType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003D3D6085000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003D3D6091000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003C3D60C1000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000140C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000014040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000003C3D6C81000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003C3D6881000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003C3DE0C1000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003C3FE081000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000002A002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C3D68C1000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000C000000F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});

}