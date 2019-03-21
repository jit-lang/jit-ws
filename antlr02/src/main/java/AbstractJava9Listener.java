import io.github.optjava.generated.Java9Listener;
import io.github.optjava.generated.Java9Parser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public abstract class AbstractJava9Listener implements Java9Listener {
  @Override
  public void visitTerminal(TerminalNode node) {}

  @Override
  public void visitErrorNode(ErrorNode node) {}

  @Override
  public void enterEveryRule(ParserRuleContext ctx) {}

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {}

  @Override
  public void enterLiteral(LiteralContext ctx) {}

  @Override
  public void exitLiteral(LiteralContext ctx) {}

  @Override
  public void enterPrimitiveType(PrimitiveTypeContext ctx) {}

  @Override
  public void exitPrimitiveType(PrimitiveTypeContext ctx) {}

  @Override
  public void enterNumericType(NumericTypeContext ctx) {}

  @Override
  public void exitNumericType(NumericTypeContext ctx) {}

  @Override
  public void enterIntegralType(IntegralTypeContext ctx) {}

  @Override
  public void exitIntegralType(IntegralTypeContext ctx) {}

  @Override
  public void enterFloatingPointType(FloatingPointTypeContext ctx) {}

  @Override
  public void exitFloatingPointType(FloatingPointTypeContext ctx) {}

  @Override
  public void enterReferenceType(ReferenceTypeContext ctx) {}

  @Override
  public void exitReferenceType(ReferenceTypeContext ctx) {}

  @Override
  public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterClassType(ClassTypeContext ctx) {}

  @Override
  public void exitClassType(ClassTypeContext ctx) {}

  @Override
  public void enterClassType_lf_classOrInterfaceType(
      ClassType_lf_classOrInterfaceTypeContext ctx) {}

  @Override
  public void exitClassType_lf_classOrInterfaceType(ClassType_lf_classOrInterfaceTypeContext ctx) {}

  @Override
  public void enterClassType_lfno_classOrInterfaceType(
      ClassType_lfno_classOrInterfaceTypeContext ctx) {}

  @Override
  public void exitClassType_lfno_classOrInterfaceType(
      ClassType_lfno_classOrInterfaceTypeContext ctx) {}

  @Override
  public void enterInterfaceType(InterfaceTypeContext ctx) {}

  @Override
  public void exitInterfaceType(InterfaceTypeContext ctx) {}

  @Override
  public void enterInterfaceType_lf_classOrInterfaceType(
      InterfaceType_lf_classOrInterfaceTypeContext ctx) {}

  @Override
  public void exitInterfaceType_lf_classOrInterfaceType(
      InterfaceType_lf_classOrInterfaceTypeContext ctx) {}

  @Override
  public void enterInterfaceType_lfno_classOrInterfaceType(
      InterfaceType_lfno_classOrInterfaceTypeContext ctx) {}

  @Override
  public void exitInterfaceType_lfno_classOrInterfaceType(
      InterfaceType_lfno_classOrInterfaceTypeContext ctx) {}

  @Override
  public void enterTypeVariable(TypeVariableContext ctx) {}

  @Override
  public void exitTypeVariable(TypeVariableContext ctx) {}

  @Override
  public void enterArrayType(ArrayTypeContext ctx) {}

  @Override
  public void exitArrayType(ArrayTypeContext ctx) {}

  @Override
  public void enterDims(DimsContext ctx) {}

  @Override
  public void exitDims(DimsContext ctx) {}

  @Override
  public void enterTypeParameter(TypeParameterContext ctx) {}

  @Override
  public void exitTypeParameter(TypeParameterContext ctx) {}

  @Override
  public void enterTypeParameterModifier(TypeParameterModifierContext ctx) {}

  @Override
  public void exitTypeParameterModifier(TypeParameterModifierContext ctx) {}

  @Override
  public void enterTypeBound(TypeBoundContext ctx) {}

  @Override
  public void exitTypeBound(TypeBoundContext ctx) {}

  @Override
  public void enterAdditionalBound(AdditionalBoundContext ctx) {}

  @Override
  public void exitAdditionalBound(AdditionalBoundContext ctx) {}

  @Override
  public void enterTypeArguments(TypeArgumentsContext ctx) {}

  @Override
  public void exitTypeArguments(TypeArgumentsContext ctx) {}

  @Override
  public void enterTypeArgumentList(TypeArgumentListContext ctx) {}

  @Override
  public void exitTypeArgumentList(TypeArgumentListContext ctx) {}

  @Override
  public void enterTypeArgument(TypeArgumentContext ctx) {}

  @Override
  public void exitTypeArgument(TypeArgumentContext ctx) {}

  @Override
  public void enterWildcard(WildcardContext ctx) {}

  @Override
  public void exitWildcard(WildcardContext ctx) {}

  @Override
  public void enterWildcardBounds(WildcardBoundsContext ctx) {}

  @Override
  public void exitWildcardBounds(WildcardBoundsContext ctx) {}

  @Override
  public void enterModuleName(ModuleNameContext ctx) {}

  @Override
  public void exitModuleName(ModuleNameContext ctx) {}

  @Override
  public void enterPackageName(PackageNameContext ctx) {}

  @Override
  public void exitPackageName(PackageNameContext ctx) {}

  @Override
  public void enterTypeName(TypeNameContext ctx) {}

  @Override
  public void exitTypeName(TypeNameContext ctx) {}

  @Override
  public void enterPackageOrTypeName(PackageOrTypeNameContext ctx) {}

  @Override
  public void exitPackageOrTypeName(PackageOrTypeNameContext ctx) {}

  @Override
  public void enterExpressionName(ExpressionNameContext ctx) {}

  @Override
  public void exitExpressionName(ExpressionNameContext ctx) {}

  @Override
  public void enterMethodName(MethodNameContext ctx) {}

  @Override
  public void exitMethodName(MethodNameContext ctx) {}

  @Override
  public void enterAmbiguousName(AmbiguousNameContext ctx) {}

  @Override
  public void exitAmbiguousName(AmbiguousNameContext ctx) {}

  @Override
  public void enterCompilationUnit(CompilationUnitContext ctx) {}

  @Override
  public void exitCompilationUnit(CompilationUnitContext ctx) {}

  @Override
  public void enterOrdinaryCompilation(OrdinaryCompilationContext ctx) {}

  @Override
  public void exitOrdinaryCompilation(OrdinaryCompilationContext ctx) {}

  @Override
  public void enterModularCompilation(ModularCompilationContext ctx) {}

  @Override
  public void exitModularCompilation(ModularCompilationContext ctx) {}

  @Override
  public void enterPackageDeclaration(PackageDeclarationContext ctx) {}

  @Override
  public void exitPackageDeclaration(PackageDeclarationContext ctx) {}

  @Override
  public void enterPackageModifier(PackageModifierContext ctx) {}

  @Override
  public void exitPackageModifier(PackageModifierContext ctx) {}

  @Override
  public void enterImportDeclaration(ImportDeclarationContext ctx) {}

  @Override
  public void exitImportDeclaration(ImportDeclarationContext ctx) {}

  @Override
  public void enterSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {}

  @Override
  public void exitSingleTypeImportDeclaration(SingleTypeImportDeclarationContext ctx) {}

  @Override
  public void enterTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {}

  @Override
  public void exitTypeImportOnDemandDeclaration(TypeImportOnDemandDeclarationContext ctx) {}

  @Override
  public void enterSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {}

  @Override
  public void exitSingleStaticImportDeclaration(SingleStaticImportDeclarationContext ctx) {}

  @Override
  public void enterStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {}

  @Override
  public void exitStaticImportOnDemandDeclaration(StaticImportOnDemandDeclarationContext ctx) {}

  @Override
  public void enterTypeDeclaration(TypeDeclarationContext ctx) {}

  @Override
  public void exitTypeDeclaration(TypeDeclarationContext ctx) {}

  @Override
  public void enterModuleDeclaration(ModuleDeclarationContext ctx) {}

  @Override
  public void exitModuleDeclaration(ModuleDeclarationContext ctx) {}

  @Override
  public void enterModuleDirective(ModuleDirectiveContext ctx) {}

  @Override
  public void exitModuleDirective(ModuleDirectiveContext ctx) {}

  @Override
  public void enterRequiresModifier(RequiresModifierContext ctx) {}

  @Override
  public void exitRequiresModifier(RequiresModifierContext ctx) {}

  @Override
  public void enterClassDeclaration(ClassDeclarationContext ctx) {}

  @Override
  public void exitClassDeclaration(ClassDeclarationContext ctx) {}

  @Override
  public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {}

  @Override
  public void exitNormalClassDeclaration(NormalClassDeclarationContext ctx) {}

  @Override
  public void enterClassModifier(ClassModifierContext ctx) {}

  @Override
  public void exitClassModifier(ClassModifierContext ctx) {}

  @Override
  public void enterTypeParameters(TypeParametersContext ctx) {}

  @Override
  public void exitTypeParameters(TypeParametersContext ctx) {}

  @Override
  public void enterTypeParameterList(TypeParameterListContext ctx) {}

  @Override
  public void exitTypeParameterList(TypeParameterListContext ctx) {}

  @Override
  public void enterSuperclass(SuperclassContext ctx) {}

  @Override
  public void exitSuperclass(SuperclassContext ctx) {}

  @Override
  public void enterSuperinterfaces(SuperinterfacesContext ctx) {}

  @Override
  public void exitSuperinterfaces(SuperinterfacesContext ctx) {}

  @Override
  public void enterInterfaceTypeList(InterfaceTypeListContext ctx) {}

  @Override
  public void exitInterfaceTypeList(InterfaceTypeListContext ctx) {}

  @Override
  public void enterClassBody(ClassBodyContext ctx) {}

  @Override
  public void exitClassBody(ClassBodyContext ctx) {}

  @Override
  public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {}

  @Override
  public void exitClassBodyDeclaration(ClassBodyDeclarationContext ctx) {}

  @Override
  public void enterClassMemberDeclaration(ClassMemberDeclarationContext ctx) {}

  @Override
  public void exitClassMemberDeclaration(ClassMemberDeclarationContext ctx) {}

  @Override
  public void enterFieldDeclaration(FieldDeclarationContext ctx) {}

  @Override
  public void exitFieldDeclaration(FieldDeclarationContext ctx) {}

  @Override
  public void enterFieldModifier(FieldModifierContext ctx) {}

  @Override
  public void exitFieldModifier(FieldModifierContext ctx) {}

  @Override
  public void enterVariableDeclaratorList(VariableDeclaratorListContext ctx) {}

  @Override
  public void exitVariableDeclaratorList(VariableDeclaratorListContext ctx) {}

  @Override
  public void enterVariableDeclarator(VariableDeclaratorContext ctx) {}

  @Override
  public void exitVariableDeclarator(VariableDeclaratorContext ctx) {}

  @Override
  public void enterVariableDeclaratorId(VariableDeclaratorIdContext ctx) {}

  @Override
  public void exitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {}

  @Override
  public void enterVariableInitializer(VariableInitializerContext ctx) {}

  @Override
  public void exitVariableInitializer(VariableInitializerContext ctx) {}

  @Override
  public void enterUnannType(UnannTypeContext ctx) {}

  @Override
  public void exitUnannType(UnannTypeContext ctx) {}

  @Override
  public void enterUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {}

  @Override
  public void exitUnannPrimitiveType(UnannPrimitiveTypeContext ctx) {}

  @Override
  public void enterUnannReferenceType(UnannReferenceTypeContext ctx) {}

  @Override
  public void exitUnannReferenceType(UnannReferenceTypeContext ctx) {}

  @Override
  public void enterUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannClassOrInterfaceType(UnannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannClassType(UnannClassTypeContext ctx) {}

  @Override
  public void exitUnannClassType(UnannClassTypeContext ctx) {}

  @Override
  public void enterUnannClassType_lf_unannClassOrInterfaceType(
      UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannClassType_lf_unannClassOrInterfaceType(
      UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannClassType_lfno_unannClassOrInterfaceType(
      UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannClassType_lfno_unannClassOrInterfaceType(
      UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannInterfaceType(UnannInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannInterfaceType(UnannInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannInterfaceType_lf_unannClassOrInterfaceType(
      UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannInterfaceType_lf_unannClassOrInterfaceType(
      UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(
      UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(
      UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {}

  @Override
  public void enterUnannTypeVariable(UnannTypeVariableContext ctx) {}

  @Override
  public void exitUnannTypeVariable(UnannTypeVariableContext ctx) {}

  @Override
  public void enterUnannArrayType(UnannArrayTypeContext ctx) {}

  @Override
  public void exitUnannArrayType(UnannArrayTypeContext ctx) {}

  @Override
  public void enterMethodDeclaration(MethodDeclarationContext ctx) {}

  @Override
  public void exitMethodDeclaration(MethodDeclarationContext ctx) {}

  @Override
  public void enterMethodModifier(MethodModifierContext ctx) {}

  @Override
  public void exitMethodModifier(MethodModifierContext ctx) {}

  @Override
  public void enterMethodHeader(MethodHeaderContext ctx) {}

  @Override
  public void exitMethodHeader(MethodHeaderContext ctx) {}

  @Override
  public void enterResult(ResultContext ctx) {}

  @Override
  public void exitResult(ResultContext ctx) {}

  @Override
  public void enterMethodDeclarator(MethodDeclaratorContext ctx) {}

  @Override
  public void exitMethodDeclarator(MethodDeclaratorContext ctx) {}

  @Override
  public void enterFormalParameterList(FormalParameterListContext ctx) {}

  @Override
  public void exitFormalParameterList(FormalParameterListContext ctx) {}

  @Override
  public void enterFormalParameters(FormalParametersContext ctx) {}

  @Override
  public void exitFormalParameters(FormalParametersContext ctx) {}

  @Override
  public void enterFormalParameter(FormalParameterContext ctx) {}

  @Override
  public void exitFormalParameter(FormalParameterContext ctx) {}

  @Override
  public void enterVariableModifier(VariableModifierContext ctx) {}

  @Override
  public void exitVariableModifier(VariableModifierContext ctx) {}

  @Override
  public void enterLastFormalParameter(LastFormalParameterContext ctx) {}

  @Override
  public void exitLastFormalParameter(LastFormalParameterContext ctx) {}

  @Override
  public void enterReceiverParameter(ReceiverParameterContext ctx) {}

  @Override
  public void exitReceiverParameter(ReceiverParameterContext ctx) {}

  @Override
  public void enterThrows_(Throws_Context ctx) {}

  @Override
  public void exitThrows_(Throws_Context ctx) {}

  @Override
  public void enterExceptionTypeList(ExceptionTypeListContext ctx) {}

  @Override
  public void exitExceptionTypeList(ExceptionTypeListContext ctx) {}

  @Override
  public void enterExceptionType(ExceptionTypeContext ctx) {}

  @Override
  public void exitExceptionType(ExceptionTypeContext ctx) {}

  @Override
  public void enterMethodBody(MethodBodyContext ctx) {}

  @Override
  public void exitMethodBody(MethodBodyContext ctx) {}

  @Override
  public void enterInstanceInitializer(InstanceInitializerContext ctx) {}

  @Override
  public void exitInstanceInitializer(InstanceInitializerContext ctx) {}

  @Override
  public void enterStaticInitializer(StaticInitializerContext ctx) {}

  @Override
  public void exitStaticInitializer(StaticInitializerContext ctx) {}

  @Override
  public void enterConstructorDeclaration(ConstructorDeclarationContext ctx) {}

  @Override
  public void exitConstructorDeclaration(ConstructorDeclarationContext ctx) {}

  @Override
  public void enterConstructorModifier(ConstructorModifierContext ctx) {}

  @Override
  public void exitConstructorModifier(ConstructorModifierContext ctx) {}

  @Override
  public void enterConstructorDeclarator(ConstructorDeclaratorContext ctx) {}

  @Override
  public void exitConstructorDeclarator(ConstructorDeclaratorContext ctx) {}

  @Override
  public void enterSimpleTypeName(SimpleTypeNameContext ctx) {}

  @Override
  public void exitSimpleTypeName(SimpleTypeNameContext ctx) {}

  @Override
  public void enterConstructorBody(ConstructorBodyContext ctx) {}

  @Override
  public void exitConstructorBody(ConstructorBodyContext ctx) {}

  @Override
  public void enterExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {}

  @Override
  public void exitExplicitConstructorInvocation(ExplicitConstructorInvocationContext ctx) {}

  @Override
  public void enterEnumDeclaration(EnumDeclarationContext ctx) {}

  @Override
  public void exitEnumDeclaration(EnumDeclarationContext ctx) {}

  @Override
  public void enterEnumBody(EnumBodyContext ctx) {}

  @Override
  public void exitEnumBody(EnumBodyContext ctx) {}

  @Override
  public void enterEnumConstantList(EnumConstantListContext ctx) {}

  @Override
  public void exitEnumConstantList(EnumConstantListContext ctx) {}

  @Override
  public void enterEnumConstant(EnumConstantContext ctx) {}

  @Override
  public void exitEnumConstant(EnumConstantContext ctx) {}

  @Override
  public void enterEnumConstantModifier(EnumConstantModifierContext ctx) {}

  @Override
  public void exitEnumConstantModifier(EnumConstantModifierContext ctx) {}

  @Override
  public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {}

  @Override
  public void exitEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {}

  @Override
  public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {}

  @Override
  public void exitInterfaceDeclaration(InterfaceDeclarationContext ctx) {}

  @Override
  public void enterNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {}

  @Override
  public void exitNormalInterfaceDeclaration(NormalInterfaceDeclarationContext ctx) {}

  @Override
  public void enterInterfaceModifier(InterfaceModifierContext ctx) {}

  @Override
  public void exitInterfaceModifier(InterfaceModifierContext ctx) {}

  @Override
  public void enterExtendsInterfaces(ExtendsInterfacesContext ctx) {}

  @Override
  public void exitExtendsInterfaces(ExtendsInterfacesContext ctx) {}

  @Override
  public void enterInterfaceBody(InterfaceBodyContext ctx) {}

  @Override
  public void exitInterfaceBody(InterfaceBodyContext ctx) {}

  @Override
  public void enterInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {}

  @Override
  public void exitInterfaceMemberDeclaration(InterfaceMemberDeclarationContext ctx) {}

  @Override
  public void enterConstantDeclaration(ConstantDeclarationContext ctx) {}

  @Override
  public void exitConstantDeclaration(ConstantDeclarationContext ctx) {}

  @Override
  public void enterConstantModifier(ConstantModifierContext ctx) {}

  @Override
  public void exitConstantModifier(ConstantModifierContext ctx) {}

  @Override
  public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {}

  @Override
  public void exitInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {}

  @Override
  public void enterInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {}

  @Override
  public void exitInterfaceMethodModifier(InterfaceMethodModifierContext ctx) {}

  @Override
  public void enterAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {}

  @Override
  public void exitAnnotationTypeDeclaration(AnnotationTypeDeclarationContext ctx) {}

  @Override
  public void enterAnnotationTypeBody(AnnotationTypeBodyContext ctx) {}

  @Override
  public void exitAnnotationTypeBody(AnnotationTypeBodyContext ctx) {}

  @Override
  public void enterAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {}

  @Override
  public void exitAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclarationContext ctx) {}

  @Override
  public void enterAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {}

  @Override
  public void exitAnnotationTypeElementDeclaration(AnnotationTypeElementDeclarationContext ctx) {}

  @Override
  public void enterAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {}

  @Override
  public void exitAnnotationTypeElementModifier(AnnotationTypeElementModifierContext ctx) {}

  @Override
  public void enterDefaultValue(DefaultValueContext ctx) {}

  @Override
  public void exitDefaultValue(DefaultValueContext ctx) {}

  @Override
  public void enterAnnotation(AnnotationContext ctx) {}

  @Override
  public void exitAnnotation(AnnotationContext ctx) {}

  @Override
  public void enterNormalAnnotation(NormalAnnotationContext ctx) {}

  @Override
  public void exitNormalAnnotation(NormalAnnotationContext ctx) {}

  @Override
  public void enterElementValuePairList(ElementValuePairListContext ctx) {}

  @Override
  public void exitElementValuePairList(ElementValuePairListContext ctx) {}

  @Override
  public void enterElementValuePair(ElementValuePairContext ctx) {}

  @Override
  public void exitElementValuePair(ElementValuePairContext ctx) {}

  @Override
  public void enterElementValue(ElementValueContext ctx) {}

  @Override
  public void exitElementValue(ElementValueContext ctx) {}

  @Override
  public void enterElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {}

  @Override
  public void exitElementValueArrayInitializer(ElementValueArrayInitializerContext ctx) {}

  @Override
  public void enterElementValueList(ElementValueListContext ctx) {}

  @Override
  public void exitElementValueList(ElementValueListContext ctx) {}

  @Override
  public void enterMarkerAnnotation(MarkerAnnotationContext ctx) {}

  @Override
  public void exitMarkerAnnotation(MarkerAnnotationContext ctx) {}

  @Override
  public void enterSingleElementAnnotation(SingleElementAnnotationContext ctx) {}

  @Override
  public void exitSingleElementAnnotation(SingleElementAnnotationContext ctx) {}

  @Override
  public void enterArrayInitializer(ArrayInitializerContext ctx) {}

  @Override
  public void exitArrayInitializer(ArrayInitializerContext ctx) {}

  @Override
  public void enterVariableInitializerList(VariableInitializerListContext ctx) {}

  @Override
  public void exitVariableInitializerList(VariableInitializerListContext ctx) {}

  @Override
  public void enterBlock(BlockContext ctx) {}

  @Override
  public void exitBlock(BlockContext ctx) {}

  @Override
  public void enterBlockStatements(BlockStatementsContext ctx) {}

  @Override
  public void exitBlockStatements(BlockStatementsContext ctx) {}

  @Override
  public void enterBlockStatement(BlockStatementContext ctx) {}

  @Override
  public void exitBlockStatement(BlockStatementContext ctx) {}

  @Override
  public void enterLocalVariableDeclarationStatement(
      LocalVariableDeclarationStatementContext ctx) {}

  @Override
  public void exitLocalVariableDeclarationStatement(LocalVariableDeclarationStatementContext ctx) {}

  @Override
  public void enterLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {}

  @Override
  public void exitLocalVariableDeclaration(LocalVariableDeclarationContext ctx) {}

  @Override
  public void enterStatement(StatementContext ctx) {}

  @Override
  public void exitStatement(StatementContext ctx) {}

  @Override
  public void enterStatementNoShortIf(StatementNoShortIfContext ctx) {}

  @Override
  public void exitStatementNoShortIf(StatementNoShortIfContext ctx) {}

  @Override
  public void enterStatementWithoutTrailingSubstatement(
      StatementWithoutTrailingSubstatementContext ctx) {}

  @Override
  public void exitStatementWithoutTrailingSubstatement(
      StatementWithoutTrailingSubstatementContext ctx) {}

  @Override
  public void enterEmptyStatement(EmptyStatementContext ctx) {}

  @Override
  public void exitEmptyStatement(EmptyStatementContext ctx) {}

  @Override
  public void enterLabeledStatement(LabeledStatementContext ctx) {}

  @Override
  public void exitLabeledStatement(LabeledStatementContext ctx) {}

  @Override
  public void enterLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {}

  @Override
  public void exitLabeledStatementNoShortIf(LabeledStatementNoShortIfContext ctx) {}

  @Override
  public void enterExpressionStatement(ExpressionStatementContext ctx) {}

  @Override
  public void exitExpressionStatement(ExpressionStatementContext ctx) {}

  @Override
  public void enterStatementExpression(StatementExpressionContext ctx) {}

  @Override
  public void exitStatementExpression(StatementExpressionContext ctx) {}

  @Override
  public void enterIfThenStatement(IfThenStatementContext ctx) {}

  @Override
  public void exitIfThenStatement(IfThenStatementContext ctx) {}

  @Override
  public void enterIfThenElseStatement(IfThenElseStatementContext ctx) {}

  @Override
  public void exitIfThenElseStatement(IfThenElseStatementContext ctx) {}

  @Override
  public void enterIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {}

  @Override
  public void exitIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIfContext ctx) {}

  @Override
  public void enterAssertStatement(AssertStatementContext ctx) {}

  @Override
  public void exitAssertStatement(AssertStatementContext ctx) {}

  @Override
  public void enterSwitchStatement(SwitchStatementContext ctx) {}

  @Override
  public void exitSwitchStatement(SwitchStatementContext ctx) {}

  @Override
  public void enterSwitchBlock(SwitchBlockContext ctx) {}

  @Override
  public void exitSwitchBlock(SwitchBlockContext ctx) {}

  @Override
  public void enterSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {}

  @Override
  public void exitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {}

  @Override
  public void enterSwitchLabels(SwitchLabelsContext ctx) {}

  @Override
  public void exitSwitchLabels(SwitchLabelsContext ctx) {}

  @Override
  public void enterSwitchLabel(SwitchLabelContext ctx) {}

  @Override
  public void exitSwitchLabel(SwitchLabelContext ctx) {}

  @Override
  public void enterEnumConstantName(EnumConstantNameContext ctx) {}

  @Override
  public void exitEnumConstantName(EnumConstantNameContext ctx) {}

  @Override
  public void enterWhileStatement(WhileStatementContext ctx) {}

  @Override
  public void exitWhileStatement(WhileStatementContext ctx) {}

  @Override
  public void enterWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {}

  @Override
  public void exitWhileStatementNoShortIf(WhileStatementNoShortIfContext ctx) {}

  @Override
  public void enterDoStatement(DoStatementContext ctx) {}

  @Override
  public void exitDoStatement(DoStatementContext ctx) {}

  @Override
  public void enterForStatement(ForStatementContext ctx) {}

  @Override
  public void exitForStatement(ForStatementContext ctx) {}

  @Override
  public void enterForStatementNoShortIf(ForStatementNoShortIfContext ctx) {}

  @Override
  public void exitForStatementNoShortIf(ForStatementNoShortIfContext ctx) {}

  @Override
  public void enterBasicForStatement(BasicForStatementContext ctx) {}

  @Override
  public void exitBasicForStatement(BasicForStatementContext ctx) {}

  @Override
  public void enterBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {}

  @Override
  public void exitBasicForStatementNoShortIf(BasicForStatementNoShortIfContext ctx) {}

  @Override
  public void enterForInit(ForInitContext ctx) {}

  @Override
  public void exitForInit(ForInitContext ctx) {}

  @Override
  public void enterForUpdate(ForUpdateContext ctx) {}

  @Override
  public void exitForUpdate(ForUpdateContext ctx) {}

  @Override
  public void enterStatementExpressionList(StatementExpressionListContext ctx) {}

  @Override
  public void exitStatementExpressionList(StatementExpressionListContext ctx) {}

  @Override
  public void enterEnhancedForStatement(EnhancedForStatementContext ctx) {}

  @Override
  public void exitEnhancedForStatement(EnhancedForStatementContext ctx) {}

  @Override
  public void enterEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {}

  @Override
  public void exitEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIfContext ctx) {}

  @Override
  public void enterBreakStatement(BreakStatementContext ctx) {}

  @Override
  public void exitBreakStatement(BreakStatementContext ctx) {}

  @Override
  public void enterContinueStatement(ContinueStatementContext ctx) {}

  @Override
  public void exitContinueStatement(ContinueStatementContext ctx) {}

  @Override
  public void enterReturnStatement(ReturnStatementContext ctx) {}

  @Override
  public void exitReturnStatement(ReturnStatementContext ctx) {}

  @Override
  public void enterThrowStatement(ThrowStatementContext ctx) {}

  @Override
  public void exitThrowStatement(ThrowStatementContext ctx) {}

  @Override
  public void enterSynchronizedStatement(SynchronizedStatementContext ctx) {}

  @Override
  public void exitSynchronizedStatement(SynchronizedStatementContext ctx) {}

  @Override
  public void enterTryStatement(TryStatementContext ctx) {}

  @Override
  public void exitTryStatement(TryStatementContext ctx) {}

  @Override
  public void enterCatches(CatchesContext ctx) {}

  @Override
  public void exitCatches(CatchesContext ctx) {}

  @Override
  public void enterCatchClause(CatchClauseContext ctx) {}

  @Override
  public void exitCatchClause(CatchClauseContext ctx) {}

  @Override
  public void enterCatchFormalParameter(CatchFormalParameterContext ctx) {}

  @Override
  public void exitCatchFormalParameter(CatchFormalParameterContext ctx) {}

  @Override
  public void enterCatchType(CatchTypeContext ctx) {}

  @Override
  public void exitCatchType(CatchTypeContext ctx) {}

  @Override
  public void enterFinally_(Finally_Context ctx) {}

  @Override
  public void exitFinally_(Finally_Context ctx) {}

  @Override
  public void enterTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {}

  @Override
  public void exitTryWithResourcesStatement(TryWithResourcesStatementContext ctx) {}

  @Override
  public void enterResourceSpecification(ResourceSpecificationContext ctx) {}

  @Override
  public void exitResourceSpecification(ResourceSpecificationContext ctx) {}

  @Override
  public void enterResourceList(ResourceListContext ctx) {}

  @Override
  public void exitResourceList(ResourceListContext ctx) {}

  @Override
  public void enterResource(ResourceContext ctx) {}

  @Override
  public void exitResource(ResourceContext ctx) {}

  @Override
  public void enterVariableAccess(VariableAccessContext ctx) {}

  @Override
  public void exitVariableAccess(VariableAccessContext ctx) {}

  @Override
  public void enterPrimary(PrimaryContext ctx) {}

  @Override
  public void exitPrimary(PrimaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray(PrimaryNoNewArrayContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lf_arrayAccess(PrimaryNoNewArray_lf_arrayAccessContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lfno_arrayAccess(
      PrimaryNoNewArray_lfno_arrayAccessContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lfno_arrayAccess(
      PrimaryNoNewArray_lfno_arrayAccessContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lf_primary(PrimaryNoNewArray_lf_primaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
      PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
      PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
      PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
      PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
      PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
      PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
      PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
      PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void enterClassLiteral(ClassLiteralContext ctx) {}

  @Override
  public void exitClassLiteral(ClassLiteralContext ctx) {}

  @Override
  public void enterClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {}

  @Override
  public void exitClassInstanceCreationExpression(ClassInstanceCreationExpressionContext ctx) {}

  @Override
  public void enterClassInstanceCreationExpression_lf_primary(
      ClassInstanceCreationExpression_lf_primaryContext ctx) {}

  @Override
  public void exitClassInstanceCreationExpression_lf_primary(
      ClassInstanceCreationExpression_lf_primaryContext ctx) {}

  @Override
  public void enterClassInstanceCreationExpression_lfno_primary(
      ClassInstanceCreationExpression_lfno_primaryContext ctx) {}

  @Override
  public void exitClassInstanceCreationExpression_lfno_primary(
      ClassInstanceCreationExpression_lfno_primaryContext ctx) {}

  @Override
  public void enterTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {}

  @Override
  public void exitTypeArgumentsOrDiamond(TypeArgumentsOrDiamondContext ctx) {}

  @Override
  public void enterFieldAccess(FieldAccessContext ctx) {}

  @Override
  public void exitFieldAccess(FieldAccessContext ctx) {}

  @Override
  public void enterFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {}

  @Override
  public void exitFieldAccess_lf_primary(FieldAccess_lf_primaryContext ctx) {}

  @Override
  public void enterFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {}

  @Override
  public void exitFieldAccess_lfno_primary(FieldAccess_lfno_primaryContext ctx) {}

  @Override
  public void enterArrayAccess(ArrayAccessContext ctx) {}

  @Override
  public void exitArrayAccess(ArrayAccessContext ctx) {}

  @Override
  public void enterArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {}

  @Override
  public void exitArrayAccess_lf_primary(ArrayAccess_lf_primaryContext ctx) {}

  @Override
  public void enterArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void exitArrayAccess_lfno_primary(ArrayAccess_lfno_primaryContext ctx) {}

  @Override
  public void enterMethodInvocation(MethodInvocationContext ctx) {}

  @Override
  public void exitMethodInvocation(MethodInvocationContext ctx) {}

  @Override
  public void enterMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {}

  @Override
  public void exitMethodInvocation_lf_primary(MethodInvocation_lf_primaryContext ctx) {}

  @Override
  public void enterMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {}

  @Override
  public void exitMethodInvocation_lfno_primary(MethodInvocation_lfno_primaryContext ctx) {}

  @Override
  public void enterArgumentList(ArgumentListContext ctx) {}

  @Override
  public void exitArgumentList(ArgumentListContext ctx) {}

  @Override
  public void enterMethodReference(MethodReferenceContext ctx) {}

  @Override
  public void exitMethodReference(MethodReferenceContext ctx) {}

  @Override
  public void enterMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {}

  @Override
  public void exitMethodReference_lf_primary(MethodReference_lf_primaryContext ctx) {}

  @Override
  public void enterMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {}

  @Override
  public void exitMethodReference_lfno_primary(MethodReference_lfno_primaryContext ctx) {}

  @Override
  public void enterArrayCreationExpression(ArrayCreationExpressionContext ctx) {}

  @Override
  public void exitArrayCreationExpression(ArrayCreationExpressionContext ctx) {}

  @Override
  public void enterDimExprs(DimExprsContext ctx) {}

  @Override
  public void exitDimExprs(DimExprsContext ctx) {}

  @Override
  public void enterDimExpr(DimExprContext ctx) {}

  @Override
  public void exitDimExpr(DimExprContext ctx) {}

  @Override
  public void enterConstantExpression(ConstantExpressionContext ctx) {}

  @Override
  public void exitConstantExpression(ConstantExpressionContext ctx) {}

  @Override
  public void enterExpression(ExpressionContext ctx) {}

  @Override
  public void exitExpression(ExpressionContext ctx) {}

  @Override
  public void enterLambdaExpression(LambdaExpressionContext ctx) {}

  @Override
  public void exitLambdaExpression(LambdaExpressionContext ctx) {}

  @Override
  public void enterLambdaParameters(LambdaParametersContext ctx) {}

  @Override
  public void exitLambdaParameters(LambdaParametersContext ctx) {}

  @Override
  public void enterInferredFormalParameterList(InferredFormalParameterListContext ctx) {}

  @Override
  public void exitInferredFormalParameterList(InferredFormalParameterListContext ctx) {}

  @Override
  public void enterLambdaBody(LambdaBodyContext ctx) {}

  @Override
  public void exitLambdaBody(LambdaBodyContext ctx) {}

  @Override
  public void enterAssignmentExpression(AssignmentExpressionContext ctx) {}

  @Override
  public void exitAssignmentExpression(AssignmentExpressionContext ctx) {}

  @Override
  public void enterAssignment(AssignmentContext ctx) {}

  @Override
  public void exitAssignment(AssignmentContext ctx) {}

  @Override
  public void enterLeftHandSide(LeftHandSideContext ctx) {}

  @Override
  public void exitLeftHandSide(LeftHandSideContext ctx) {}

  @Override
  public void enterAssignmentOperator(AssignmentOperatorContext ctx) {}

  @Override
  public void exitAssignmentOperator(AssignmentOperatorContext ctx) {}

  @Override
  public void enterConditionalExpression(ConditionalExpressionContext ctx) {}

  @Override
  public void exitConditionalExpression(ConditionalExpressionContext ctx) {}

  @Override
  public void enterConditionalOrExpression(ConditionalOrExpressionContext ctx) {}

  @Override
  public void exitConditionalOrExpression(ConditionalOrExpressionContext ctx) {}

  @Override
  public void enterConditionalAndExpression(ConditionalAndExpressionContext ctx) {}

  @Override
  public void exitConditionalAndExpression(ConditionalAndExpressionContext ctx) {}

  @Override
  public void enterInclusiveOrExpression(InclusiveOrExpressionContext ctx) {}

  @Override
  public void exitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {}

  @Override
  public void enterExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {}

  @Override
  public void exitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {}

  @Override
  public void enterAndExpression(AndExpressionContext ctx) {}

  @Override
  public void exitAndExpression(AndExpressionContext ctx) {}

  @Override
  public void enterEqualityExpression(EqualityExpressionContext ctx) {}

  @Override
  public void exitEqualityExpression(EqualityExpressionContext ctx) {}

  @Override
  public void enterRelationalExpression(RelationalExpressionContext ctx) {}

  @Override
  public void exitRelationalExpression(RelationalExpressionContext ctx) {}

  @Override
  public void enterShiftExpression(ShiftExpressionContext ctx) {}

  @Override
  public void exitShiftExpression(ShiftExpressionContext ctx) {}

  @Override
  public void enterAdditiveExpression(AdditiveExpressionContext ctx) {}

  @Override
  public void exitAdditiveExpression(AdditiveExpressionContext ctx) {}

  @Override
  public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {}

  @Override
  public void exitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {}

  @Override
  public void enterUnaryExpression(UnaryExpressionContext ctx) {}

  @Override
  public void exitUnaryExpression(UnaryExpressionContext ctx) {}

  @Override
  public void enterPreIncrementExpression(PreIncrementExpressionContext ctx) {}

  @Override
  public void exitPreIncrementExpression(PreIncrementExpressionContext ctx) {}

  @Override
  public void enterPreDecrementExpression(PreDecrementExpressionContext ctx) {}

  @Override
  public void exitPreDecrementExpression(PreDecrementExpressionContext ctx) {}

  @Override
  public void enterUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {}

  @Override
  public void exitUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinusContext ctx) {}

  @Override
  public void enterPostfixExpression(PostfixExpressionContext ctx) {}

  @Override
  public void exitPostfixExpression(PostfixExpressionContext ctx) {}

  @Override
  public void enterPostIncrementExpression(PostIncrementExpressionContext ctx) {}

  @Override
  public void exitPostIncrementExpression(PostIncrementExpressionContext ctx) {}

  @Override
  public void enterPostIncrementExpression_lf_postfixExpression(
      PostIncrementExpression_lf_postfixExpressionContext ctx) {}

  @Override
  public void exitPostIncrementExpression_lf_postfixExpression(
      PostIncrementExpression_lf_postfixExpressionContext ctx) {}

  @Override
  public void enterPostDecrementExpression(PostDecrementExpressionContext ctx) {}

  @Override
  public void exitPostDecrementExpression(PostDecrementExpressionContext ctx) {}

  @Override
  public void enterPostDecrementExpression_lf_postfixExpression(
      PostDecrementExpression_lf_postfixExpressionContext ctx) {}

  @Override
  public void exitPostDecrementExpression_lf_postfixExpression(
      PostDecrementExpression_lf_postfixExpressionContext ctx) {}

  @Override
  public void enterCastExpression(CastExpressionContext ctx) {}

  @Override
  public void exitCastExpression(CastExpressionContext ctx) {}

  @Override
  public void enterIdentifier(IdentifierContext ctx) {}

  @Override
  public void exitIdentifier(IdentifierContext ctx) {}
}
